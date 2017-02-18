package com.global.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.login.dao.LoginDao;
import com.global.login.request.LoginRequest;
import com.global.login.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao loginDao;
	
    @Override
	public String validateLogin(LoginRequest loginRequest)
	{
    	return loginDao.validateLogin(loginRequest);
	}
}
