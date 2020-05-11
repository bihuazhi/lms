package com.lms.domain.info.response;

import com.lms.domain.PePermission;
import com.lms.domain.PeRole;
import com.lms.domain.PeUser;
import org.crazycake.shiro.AuthCachePrincipal;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2020/3/3/003.
 */
public class ProfileResult implements Serializable,AuthCachePrincipal {

    private String userid;
    private String mobile; //登录名（手机）
    private String username; //用户名
    private String password;//密码
    private String outletId; //所在网点
    private String level; //用户级别
    private String empId; //绑定的用户
    private String createTime; //创建时间

    private Set<PeRole> roles;  //角色信息
    //权限
    private Set<PePermission> perms; //权限信息

    //获得相应的权限(用户级别较高的 系统管理员、管理层级别的用户)
    public ProfileResult(PeUser user, List<PeRole> roles,List<PePermission> perms){
        this.userid = user.getId();
        this.username= user.getUsername();
        this.outletId = user.getOutletsId();
        this.mobile = user.getMobile();
        this.empId = user.getEmpId();
        this.level = user.getLevel();
        this.roles = new HashSet<>(roles); //用户列表
        this.perms =  new HashSet<>(perms); //权限列表
    }

    @Override
    public String toString() {
        return "ProfileResult{" +
                "mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", outletId='" + outletId + '\'' +
                ", level='" + level + '\'' +
                ", empId='" + empId + '\'' +
                ", roles=" + roles +
                ", perms=" + perms +
                '}';
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOutletId() {
        return outletId;
    }

    public void setOutletId(String outletId) {
        this.outletId = outletId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Set<PeRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<PeRole> roles) {
        this.roles = roles;
    }

    public Set<PePermission> getPerms() {
        return perms;
    }

    public void setPerms(Set<PePermission> perms) {
        this.perms = perms;
    }

    @Override
    public String getAuthCacheKey() {
        return null;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
