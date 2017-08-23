package com.geely.evun.salty.core.security;

/**
 * Created by hangjie.lou on 2017/8/17.
 */

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 退出系统 filter
 *
 * @author Benny
 */
public class AdminLogoutFilter extends LogoutFilter {

    @Override
    protected String getRedirectUrl(ServletRequest req, ServletResponse resp, Subject subject) {
        HttpServletRequest request = (HttpServletRequest) req;
        //TODO
        String redirectUrl = "";
//                request.getParameter(Constants.RETURN_URL);

        if (StringUtils.isBlank(redirectUrl)) {
            redirectUrl = getLogoutUrl();
            if (StringUtils.isBlank(redirectUrl)) {
                redirectUrl = getRedirectUrl();
            }
        }
        return redirectUrl;
    }

    private String logoutUrl;

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }
}