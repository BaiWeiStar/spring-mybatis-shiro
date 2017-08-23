package com.geely.evun.salty.core.Interceptor;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hangjie.lou on 2017/8/17.
 */
public class AdminContextInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求链接
        String uri = getURI(request);
        // 排除例外URI，例如：登陆、退出
        if (exclude(uri)) {
            return true;
        }
        Subject subject = SecurityUtils.getSubject();
        boolean pass = subject.isPermitted(uri);
        if (pass) {
            return true;
        } else {
            // 跳转至异常处理
            throw new Exception();
        }
    }

    /**
     * 判断是否例外uri
     *
     * @param uri
     * @return
     */
    private boolean exclude(String uri) {
        if (excludeUrls != null) {
            for (String exc : excludeUrls) {
                // 允许以excludeurl结尾的请求
                if (uri.endsWith(exc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 获取请求URL
     *
     * @param request
     * @return
     */
    private static String getURI(HttpServletRequest request) {
        UrlPathHelper helper = new UrlPathHelper();
        return helper.getOriginatingRequestUri(request);
    }

    private String[] excludeUrls;

    public void setExcludeUrls(String[] excludeUrls) {
        this.excludeUrls = excludeUrls;
    }

}
