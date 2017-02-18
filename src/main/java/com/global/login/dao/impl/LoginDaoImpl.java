package com.global.login.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.global.login.constants.QueryConstants;
import com.global.login.dao.LoginDao;
import com.global.login.entity.Login;
import com.global.login.entity.Patient;
import com.global.login.extractor.LoginExtractor;
import com.global.login.extractor.PatientExtractor;
import com.global.login.request.LoginRequest;
@Repository
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String validateLogin(LoginRequest loginRequest) {
		 StringBuffer query = new StringBuffer(QueryConstants.IS_EXIST);
		  List<String> args = new ArrayList<>();

	        if (!StringUtils.isEmpty(loginRequest.getMoblie())) {
	            args.add(loginRequest.getMoblie());
	        }
	        if (!StringUtils.isEmpty(loginRequest.getPassword())) {
	            args.add(loginRequest.getPassword());
	        }
	        if (!StringUtils.isEmpty(loginRequest.getType())) {
	            args.add(loginRequest.getType());
	        }

		 List<Login> response = jdbcTemplate.query(query.toString(), new LoginExtractor(), args.toArray());
				 
				 if (!StringUtils.isEmpty(response) && response.size() > 0) {
					return "success"; 
	        }
		return "failure";

	}

}
