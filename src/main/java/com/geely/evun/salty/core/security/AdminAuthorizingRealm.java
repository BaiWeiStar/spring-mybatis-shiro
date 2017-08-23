package com.geely.evun.salty.core.security;

import com.geely.evun.salty.core.utils.SpringContextUtil;
import com.geely.evun.salty.demo.entity.BaseUserInfo;
import com.geely.evun.salty.demo.entity.User;
import com.geely.evun.salty.demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 认证及授权Realm
 * Created by hangjie.lou on 2017/8/17.
 */
public class AdminAuthorizingRealm extends AuthorizingRealm {
    private UserService userService;
    /*登陆认证*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        if (userService == null) {
            userService = (UserService) SpringContextUtil.getBean(UserService.class);
        }
        User user = userService.login(token.getUsername());
        if (user != null) {
            return new SimpleAuthenticationInfo(user, user.getCpwd(), getName());
        } else {
            return null;
        }
    }
}
