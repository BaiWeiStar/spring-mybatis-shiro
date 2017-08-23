package com.geely.evun.salty.core.security;

/**
 * Created by hangjie.lou on 2017/8/17.
 */

import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户认证检查filter
 *
 * @author Benny
 */
public class AdminUserFilter extends UserFilter {
    // 未登陆重定向到登陆页
    protected void redirectToLogin(ServletRequest req, ServletResponse resp) throws IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        WebUtils.issueRedirect(request, response, getLoginUrl());
    }
}