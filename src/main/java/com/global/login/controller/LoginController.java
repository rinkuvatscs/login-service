package com.global.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.global.login.request.LoginRequest;
import com.global.login.response.LoginResponse;
import com.global.login.service.LoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/login")
@Api(basePath = "/login", value = "loginmanagement", description = "Operations with Landlords", produces = "application/json")

public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "validate login", notes = "validate login")
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "Fields are with validation errors"),
			@ApiResponse(code = 201, message = "") })	
	public ResponseEntity<LoginResponse> validateLogin(@RequestBody LoginRequest loginRequest)
	{
		LoginResponse loginResponse=new LoginResponse();
		loginService.validateLogin(loginRequest);
		return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
	}

}
