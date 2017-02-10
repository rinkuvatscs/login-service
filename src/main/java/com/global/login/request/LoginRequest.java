package com.global.login.request;


public class LoginRequest {

    private String email ;
    private String moblie ;
    private String type ;
    private String password ;
    
    public String getEmail() {
    
        return email;
    }
    
    public void setEmail(String email) {
    
        this.email = email;
    }
    
    public String getMoblie() {
    
        return moblie;
    }
    
    public void setMoblie(String moblie) {
    
        this.moblie = moblie;
    }
    
    public String getType() {
    
        return type;
    }
    
    public void setType(String type) {
    
        this.type = type;
    }
    
    public String getPassword() {
    
        return password;
    }
    
    public void setPassword(String password) {
    
        this.password = password;
    }
    
    @Override
    public String toString() {

        return "LoginRequest [email=" + email + ", moblie=" + moblie + ", type=" + type + ", password=" + password
                + "]";
    }

}
