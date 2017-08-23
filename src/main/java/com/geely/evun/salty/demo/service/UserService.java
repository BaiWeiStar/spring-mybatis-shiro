package com.geely.evun.salty.demo.service;

import com.geely.evun.salty.demo.entity.BaseUserInfo;
import com.geely.evun.salty.demo.entity.User;

/**
 * Created by hangjie.lou on 2017/8/17.
 */
public interface UserService {
    User login(String token);
}
