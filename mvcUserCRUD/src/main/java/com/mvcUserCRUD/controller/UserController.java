package com.mvcUserCRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage(){
		System.out.println("Test Case 123");
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String getWelcomePage( @RequestParam String userEmail, @RequestParam String userPassword) {
		
		System.out.println(userEmail);
		
		if(userEmail.equals("admin@gmail.com") && userPassword.equals("admin")) {
			return "welcome";
		}
		else {
			return "welcome";
		}
		
	}
}
