package com.lms.config;

import com.lms.shiro.realm.CaptchaRealm;
import com.lms.shiro.realm.UserRealm;
import com.lms.shiro.session.CustomSessionManager;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.FirstSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.ShiroFilter;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/3/3/003.
 */
@Configuration //配置类
public class ShiroConfig {

    //用户安全数据认证
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }

    //手机验证码登录
    @Bean
    public CaptchaRealm captchaRealm(){
        return new CaptchaRealm();
    }

    //shiro安全管理器
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setAuthenticator(modularRealmAuthenticator()); //管理多个Realm的组件

//        securityManager.setRealm(userRealm());
        //设置安全数据源头
        List<Realm> realms = new ArrayList<>();
        realms.add(userRealm());
        realms.add(captchaRealm());
        securityManager.setRealms(realms); //设置多个Realm

        securityManager.setSessionManager(sessionManager()); //设置会话管理
        securityManager.setCacheManager(redisCacheManager()); //设置缓存管理器
        return securityManager;
     }

    /**
     * 配置系统自带的Realm的安全数据源
     * @return
     */
    @Bean
     public ModularRealmAuthenticator modularRealmAuthenticator(){
         ModularRealmAuthenticator modularRealmAuthenticator = new ModularRealmAuthenticator();
         modularRealmAuthenticator.setAuthenticationStrategy(new FirstSuccessfulStrategy()); //至少一个Realm成功
         return  modularRealmAuthenticator;
     }

    @Value("${spring.redis.port}")
     private int port;

     @Value("${spring.redis.host}")
     private String host;

     //设置本地的redis缓存
    public  RedisManager redisManager(){
        RedisManager redisManager = new RedisManager();
        redisManager.setPort(port);//端口号
        redisManager.setHost(host); //本机地址
        return redisManager;
    }

     //使用本地的缓存 替换 shiro的缓存
     public  RedisCacheManager redisCacheManager(){
         RedisCacheManager redisCacheManager = new RedisCacheManager();
         redisCacheManager.setRedisManager(redisManager()); //替换为本地缓存
         return redisCacheManager;
     }

     //配置sessionDao 使用shiro-spring的开源插件
    public RedisSessionDAO redisSessionDAO(){
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager()); //设置本地缓存
        return redisSessionDAO;
    }

    //配置shiro的会话管理器
    public SessionManager sessionManager(){
        //使用自定义的session会话管理
        CustomSessionManager sessionManager = new CustomSessionManager();
        sessionManager.setSessionDAO(redisSessionDAO());
        return sessionManager;
    }

    //配置shiro的安全过滤器
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        //创建过滤器工厂
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        //设置安全过滤器
        factoryBean.setSecurityManager(securityManager());
        //过滤器通用配置
        factoryBean.setLoginUrl("/autherror?code=" + 1);//设置登录页面
        factoryBean.setUnauthorizedUrl("/autherror?code=" + 2);//设置未授权页面
        //设置过滤集合
        Map<String, String> filterMap = new HashMap<String, String>();
        filterMap.put("/sys/user/login", "anon");  //开放登录页面
        filterMap.put("/sms/sendMessage","anon");// 发送验证码
        filterMap.put("/autherror", "anon"); //开放异常控制器
        filterMap.put("/**", "authc"); //对所有资源控制

        //设置过滤器链
        factoryBean.setFilterChainDefinitionMap(filterMap);

        return factoryBean;
    }


    //4.启动对shiro的注解支持
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager());
        return advisor;
    }


}
