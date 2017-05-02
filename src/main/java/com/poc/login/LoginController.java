package com.poc.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController { 
	
	LoginService service = new LoginService();
	
	@RequestMapping(value="/login", method=RequestMethod.GET)	
	public String getLogin(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)	
	public String handleLOginRequest(@RequestParam String name, @RequestParam String password, ModelMap model){
		
		if(!service.validatUser(name, password)){
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

}
