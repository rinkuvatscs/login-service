package com.global.login.dao;

import com.global.login.request.LoginRequest;

public interface LoginDao {

	String validateLogin(LoginRequest loginRequest);
}
