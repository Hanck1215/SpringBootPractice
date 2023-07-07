package com.sun.ch03.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController ;
import com.sun.ch03.model.User;

@RestController
@RequestMapping("/handle")
public class DemoController {
	
	@RequestMapping		//不含元素的@RequestMapping注釋將映射到空白路徑。等價於@@RequestMapping("")
	public String handle(@RequestParam(name = "username", defaultValue = "anonymous") String name,
			             @RequestParam(name = "password") String password) {
		System.out.println(name) ;
		System.out.println(password) ;
		return "Finish" ;
	}
	
	@RequestMapping("/obj")
	public String handleObj(User user) {
		System.out.println(user) ; 
		System.out.println(user.getUsername()) ; 
		return "Finish" ;
	}
	
	@RequestMapping("/json")
	public String handleJson(@RequestBody User user) {
		System.out.println(user.getUsername()) ; 
		return "Finish" ;
	}
}
