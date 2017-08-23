package com.geely.evun.salty.demo.dao;

import com.geely.evun.salty.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface QUserMapper {
    int deleteByPrimaryKey(String cid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}