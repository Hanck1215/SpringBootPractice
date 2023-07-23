package com.sugar.mainApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sugar.mainApplication.model.User;

@Controller
public class controller {
	@RequestMapping("/test")
	@ResponseBody
	public String test(@ModelAttribute("user") User usr) {
		System.out.println(usr.toString()) ;
		return "finish";
	}
	
	@ModelAttribute("user")
	public User getUser() {
		return new User("hank", 20) ;
	}
}
