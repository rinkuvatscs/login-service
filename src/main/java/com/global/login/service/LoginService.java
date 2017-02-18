package com.global.login.service;

import com.global.login.request.LoginRequest;

public interface LoginService {
	
	String validateLogin(LoginRequest loginRequest);

}
