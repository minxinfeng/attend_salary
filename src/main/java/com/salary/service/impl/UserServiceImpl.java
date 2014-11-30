package com.salary.service.impl;

import com.salary.mapper.UserInfoMapper;
import com.salary.model.entity.UserInfo;
import com.salary.service.UserService;

public class UserServiceImpl implements UserService {

	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserInfoById(int id) {
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
		return userInfo;
	}

	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}
	

}
