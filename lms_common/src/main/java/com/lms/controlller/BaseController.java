package com.lms.controlller;

import com.lms.domain.info.response.ProfileResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by Administrator on 2019/12/29/029.
 */

/**
 * 基础的控制器 主要请求和权限的更改设置
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected String userId;
    protected String mobile;
    protected String password;
    protected String username;
    protected String empId;

    @ModelAttribute   //子类调用controller方法时会调用该方法
    public void setReqAndRep(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        //获取用户登录主体
        Subject subject = SecurityUtils.getSubject();
        //获取登录信息
        PrincipalCollection principals = subject.getPrincipals();
        if (principals != null && !principals.isEmpty()) {
            ProfileResult result = (ProfileResult) principals.getPrimaryPrincipal();
            this.password = result.getPassword();
            this.username = result.getUsername();
            this.mobile = result.getMobile();
            this.userId = result.getUserid();
            this.empId = result.getEmpId();
        }
    }
}