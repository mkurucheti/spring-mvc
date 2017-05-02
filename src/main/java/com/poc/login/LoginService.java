package com.poc.login;

public class LoginService {
	
	public boolean validatUser(String user, String password){
		return user.equalsIgnoreCase("Murali") && password.equalsIgnoreCase("password");
	}
}
