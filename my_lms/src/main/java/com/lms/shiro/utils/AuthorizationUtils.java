package com.lms.shiro.utils;

import com.lms.shiro.realm.UserRealm;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;

/**
 * Created by Administrator on 2020/3/17/017.
 */
//重新加载权限和角色 防止服务器重启的问题
public class AuthorizationUtils {
    public static void reloadAuthorizing(UserRealm userRealm, String username){
        Subject subject = SecurityUtils.getSubject();
        //获取realmName的名称
        String realmName = subject.getPrincipals().getRealmNames().iterator().next();
        //第一个参数为用户名,第二个参数为realmName,test想要操作权限的用户
        SimplePrincipalCollection principals = new SimplePrincipalCollection(username,realmName);
        subject.runAs(principals);
        userRealm.getAuthorizationCache().remove(subject.getPrincipals());
        subject.releaseRunAs();
    }
}
