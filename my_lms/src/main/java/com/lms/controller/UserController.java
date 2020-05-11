package com.lms.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lms.controlller.BaseController;
import com.lms.domain.User;
import com.lms.domain.info.response.ProfileResult;
import com.lms.entity.PageResult;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.service.UserService;
import com.lms.utils.IdWorker;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/sys")
@CrossOrigin
public class UserController extends BaseController {
    @Autowired
    private UserService userService;


    /**
     * 分页查询
     * @return
     */
    @RequestMapping(value = "/user/page",method = RequestMethod.GET)
    public PageResult<User> findPage(@RequestParam Map<String,Object> param){
        //查询分页消息
        IPage<User> pageUsers = userService.page(new Page<User>(
        Long.parseLong(param.get("pagenum").toString()),
        Long.parseLong(param.get("pagesize").toString())),
        new QueryWrapper<User>()
        .like(!StringUtils.isEmpty(param.get("username").toString()),"username", param.get("username").toString())
        .like(!StringUtils.isEmpty(param.get("mobile").toString()),"mobile",param.get("mobile").toString())
        .eq(!StringUtils.isEmpty(param.get("level").toString()),"level",param.get("level").toString())
        );
        //返回数据
        return new PageResult(pageUsers.getTotal(),pageUsers.getRecords());
    }


    /**
     * 查询实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Result findOne(@PathVariable(value = "id") String id){
        return new Result(ResultCode.SUCCESS,userService.getById(id));
    }

    /**
     * 添加
     * @param user
     * @return
     */
    @RequiresPermissions("api-user-add")
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Result save(@RequestBody User user){
        System.out.println(user);
        userService.saveUser(user);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 修改
     * @param id
     * @param user
     * @return
     */
    @RequiresPermissions("api-user-edit")
    @RequestMapping(value = "/user/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @RequestBody User user){
        userService.updateById(user);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 删除
     * @param id
     * @return
     */

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        userService.removeById(id);
        return new Result(ResultCode.SUCCESS);
    }

      /* 密码和验证码登录
         * @param loginMap
         * @return
       */
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public Result userLogin(@RequestBody Map<String,String> loginMap){
             String mobile = loginMap.get("mobile").toString();
             UsernamePasswordToken token = null; //token验证
            if("password_login".equals(loginMap.get("type").toString())){ //密码登录
                String password = loginMap.get("password").toString();
                //密码加密处理
                password = new Md5Hash(password,mobile,2).toString();
                token = new UsernamePasswordToken(mobile,password);
            }
            else{  //验证码登录
                String captcha = loginMap.get("captcha").toString();
                token = new UsernamePasswordToken(mobile,captcha);
            }
            Subject subject = SecurityUtils.getSubject();
            try{
                //用户登录
            subject.login(token);
            //返回sessionId
            String sid = (String)subject.getSession().getId();
            return new  Result(ResultCode.SUCCESS,sid);
        }catch(AuthenticationException e){
            e.printStackTrace();
            return new  Result(ResultCode.USERLOGIN_ERROR);
        }catch(Exception e){
            e.printStackTrace();
            return new  Result(ResultCode.SERVER_ERROR);
        }
    }


    /**
     * 获取用户的信息
     * @return
     */
    @RequestMapping(value = "/user/profile",method = RequestMethod.GET)
    public Result profile(){
        try{
            Subject subject = SecurityUtils.getSubject();
            ProfileResult profileResult =  (ProfileResult)subject.getPrincipals().getPrimaryPrincipal();
            System.out.println(profileResult.toString());
            return new Result(ResultCode.SUCCESS,profileResult);
        }catch (Exception e ){
            e.printStackTrace();
            return new Result(ResultCode.SERVER_ERROR,null);
        }
    }

    //用户退出登录
    @PostMapping("/user/logout")
    public Result userLogout(){ //用户退出登录
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return new Result(ResultCode.SUCCESS,"你已经退出系统..");
    }

    //修改密码
    @PostMapping("/user/updatePwd")
    public Result updatePwd(@RequestBody Map<String,Object> map){
        //根据用户名查询密码
        User user = userService.findUserByMobile(mobile);
        try {
            if(user.getPassword().equals(new Md5Hash(map.get("oldpwd").toString(),mobile,2).toString())){ //如果旧密码相等
                user.setPassword(new Md5Hash(map.get("newpwd").toString(),mobile,2).toString());
                userService.update(user,new QueryWrapper<User>().eq("mobile",mobile)); //修改密码
                return new Result(ResultCode.SUCCESS,"修改密码成功~~");
            }
            return new Result(ResultCode.FAIL,"旧密码不一致..");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.FAIL,"操作失败..");
        }
    }


    /**
     * 显示Session
     * @param session
     */
    @RequestMapping("/showSession")
    public void getSession(HttpSession session){
        //获取session的所有的名称
        Enumeration enumeration = session.getAttributeNames();

        //遍历所有的session内容
        while(enumeration.hasMoreElements()){
            //获取session的键值
            String key = enumeration.nextElement().toString();

            //根据key值获取session 的值
            Object value = session.getAttribute(key).toString();

            System.out.println(value);
        }
    }

    //给用户分配角色
    @RequiresPermissions("api-role-allocate")
    @PostMapping("/user/disRole")
    public Result distributeRole(@RequestBody Map<String,Object> map){
        List<String> disRoles = JSON.parseArray(map.get("disRoles").toString(),String.class);
        userService.distruRoles(map.get("userid").toString(),disRoles);
        //分配完成权限之后 刷新权限
        return new Result(ResultCode.SUCCESS);
    }

    public static void main(String[] args) {
//        System.out.println(new Md5Hash("222222", "15100000002", 2).toString());
    }

}

