package com.lms.shiro.session;


import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.util.StringUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;

/**
 * 获取sessionid的类.
 */
public class CustomSessionManager extends DefaultWebSessionManager {

    //获取sessionid
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        //获取请求头信息
        String id= WebUtils.toHttp(request).getHeader("Authorization");
        //把Bearer+空格转化为空
        if(StringUtils.isEmpty(id)){ //如果为空则创建sessionId
            return super.getSessionId(request, response);
        }
        else { //否则直接获取session
            id = id.replace("Bearer ","");
            //否则从cookie中获取session的用户信息
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, "header");
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, id);
            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
            return id;
        }
    }
}
