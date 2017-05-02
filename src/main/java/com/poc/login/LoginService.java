package com.poc.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {	
	
	public boolean validatUser(String user, String password){
		return user.equalsIgnoreCase("Murali") && password.equalsIgnoreCase("password");
	}
}
