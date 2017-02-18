package com.global.login.constants;

public interface QueryConstants {

	String IS_EXIST = "SELECT * FROM login where `   mobile`=? and `   password`=? and `   type`=?";
	String IS_DOCTOR_EXIST = "SELECT * FROM doctor_detail where doctor_number=? and password=?";
	
	
}
