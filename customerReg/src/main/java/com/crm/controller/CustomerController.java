package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crm.model.CustomerBean;

@Controller
public class CustomerController {

	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	@GetMapping("/register")
	public String getRegisterPage(Model model) {
		System.out.println("inside - getReg");
		CustomerBean customerBean = new CustomerBean();
		model.addAttribute("custBean", customerBean);
		return "register";
	}
}
