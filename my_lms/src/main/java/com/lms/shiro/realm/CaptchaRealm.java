package com.lms.shiro.realm;

import com.lms.domain.Permission;
import com.lms.domain.Role;
import com.lms.domain.User;
import com.lms.domain.info.response.ProfileResult;
import com.lms.service.PermissionService;
import com.lms.service.RoleService;
import com.lms.service.UserService;
import com.lms.utils.JedisUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户安全数据来源.
 */
public class CaptchaRealm extends AuthorizingRealm {

    //设置realm的名称
    public void setName(){
        super.setName("captchaRealm");
    }

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private RoleService roleService;

    //授权方法
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户的登录的信息
        ProfileResult  result = (ProfileResult)principalCollection.getPrimaryPrincipal();
        Set<String> perms = new HashSet<>(0);

        //获取当前用户的角色列表
        for(Permission permission:result.getPerms()){
            perms.add(permission.getCode());
        }
        System.out.println(perms);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(perms); //设置用户的访问权限
        return info;
    }

    //用户认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
            //获取用户输入的用户名
            UsernamePasswordToken upToken = (UsernamePasswordToken)authenticationToken;
            String mobile = upToken.getUsername();
            String input_captcha = new String(upToken.getPassword());
            //保存用户登录的信息
            ProfileResult result = null;
            //查询用户是否存在  并且如果登录成功查询角色和权限信息
            User queryUser = userService.findUserByMobile(mobile);
            System.out.println(queryUser);
            //从Redis中获取验证码
            Jedis jedis = JedisUtil.getJedisClient();
            String captcha = jedis.get("sms_" + mobile);
//            String  captcha = "4000";
            System.out.println(captcha);
            if(queryUser!=null && input_captcha.equals(captcha)){ //手机不为空 验证码匹配
                    switch (queryUser.getLevel()) {
                        case "1": //系统管理员级别  拥有所有权限
                            result = new ProfileResult(queryUser, userService.findRolesByUserId(queryUser.getId()),
                                    permissionService.findAll());
                            System.out.println(result.toString());
                            break;
                        case "2"://管理层级别  根据权限的可见性查询
                            result = new ProfileResult(queryUser, userService.findRolesByUserId(queryUser.getId()),
                                    permissionService.findByEnVisible(1));
                            System.out.println(result.toString());
                            break;
                        case "3": //普通员工级别
                            //提取用户角色的id
                            List<String> roleIds = new ArrayList<>(0);
                            if(!CollectionUtils.isEmpty(userService.findRolesByUserId(queryUser.getId()))) {
                                for (Role role : userService.findRolesByUserId(queryUser.getId())) {
                                    roleIds.add(role.getId());
                                }
                            }
                            result = new ProfileResult(queryUser,userService.findRolesByUserId(queryUser.getId()),
                                    permissionService.findRolesPermsByRoleId(roleIds.size()!=0?roleIds:null));
                            System.out.println(result.toString());
                            break;
                    }
                //保存用户的信息
                SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(result,captcha,this.getName());
                return info;
            }
            else{
                return null;
            }
      }
}
