package com.salary.mapper;

import com.salary.model.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}