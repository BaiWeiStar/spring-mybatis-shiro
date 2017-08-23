package com.geely.evun.salty.demo.service.impl;

import com.geely.evun.salty.demo.entity.BaseUserInfo;
import com.geely.evun.salty.demo.entity.User;
import com.geely.evun.salty.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by hangjie.lou on 2017/8/17.
 */
@Service("qUserService")
public class UserServiceImpl implements UserService {
    @Override
    public User login(String token) {
        return new User();
    }
}
