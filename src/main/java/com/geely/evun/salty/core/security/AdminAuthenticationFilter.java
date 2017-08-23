package com.geely.evun.salty.core.security;

import com.geely.evun.salty.demo.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by hangjie.lou on 2017/8/17.
 */
public class AdminAuthenticationFilter extends FormAuthenticationFilter{
    private final static Logger logger = LoggerFactory.getLogger(AdminAuthenticationFilter.class);
    /*执行登陆操作*/
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        return super.executeLogin(request, response);
    }
    /*初始化service及登陆跳转*/
    @Override
    public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        return super.onPreHandle(request, response, mappedValue);
    }

    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        super.issueSuccessRedirect(request, response);
    }

    @Override
    protected boolean isLoginRequest(ServletRequest request, ServletResponse response) {
        return super.isLoginRequest(request, response);
    }
    /*登陆成功*/
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        return super.onLoginSuccess(token, subject, request, response);
    }
    /*登陆失败*/
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        return super.onLoginFailure(token, e, request, response);
    }
    private UserService userService;
//    private LogService logService;
//    private SessionProvider session;
//    private AuthenticationService authService;

    private String adminIndex;

    private String adminLogin;

    public String getAdminIndex() {
        return adminIndex;
    }

    public void setAdminIndex(String adminIndex) {
        this.adminIndex = adminIndex;
    }

    public String getAdminLogin() {
        return adminLogin;
    }

    public void setAdminLogin(String adminLogin) {
        this.adminLogin = adminLogin;
    }

}
