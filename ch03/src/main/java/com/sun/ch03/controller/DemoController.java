package com.sun.ch03.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController ;
import org.springframework.web.multipart.MultipartFile;

import com.sun.ch03.model.User;

@RestController
@RequestMapping("/handle")
public class DemoController {
	
	@RequestMapping		//不含元素的@RequestMapping注釋將映射到空白路徑。等價於@@RequestMapping("")
	public String handle(@RequestParam(name = "username", defaultValue = "anonymous") String name,
			             @RequestParam(name = "password") String password,
			             @RequestParam(name = "gender") Boolean gender,
			             @RequestParam(name = "interests") List<String> interests) {
		System.out.println(name) ;
		System.out.println(password) ;
		System.out.println(gender) ;
		System.out.println(interests) ;
		return "Finish" ;
	}
	
	@PostMapping("/obj")
	public String handleObj(User user) {
		System.out.println(user) ; 
		System.out.println(user.getUsername()) ; 
		System.out.println(user.getPassword()) ;
		System.out.println(user.getAge()) ;
		System.out.println(user.getGender()) ;
		System.out.println(user.getBirthday()) ;
		System.out.println(user.getInterests()) ; 
		return "Finish" ;
	}
	
	@RequestMapping("/json")
	public String handleJson(@RequestBody User user) {
		System.out.println(user.getUsername()) ; 
		return "Finish" ;
	}
	
	@RequestMapping("/file")
	public String handleFile(@RequestPart(name = "file") List<MultipartFile> multipartFiles) {
		for(MultipartFile multipartFile : multipartFiles) {
			System.out.println("上傳檔案的檔案名稱: " + multipartFile.getOriginalFilename()) ;
			System.out.println("上傳檔案的大小: " + multipartFile.getSize()) ;
		}
		return "Finish" ;
	}
	
	@RequestMapping("/header")
	public String handleHeader(@RequestHeader("User-Agent") String userAgent) {
		System.out.println(userAgent) ;
		return "Finish" ;
	}
	
	@RequestMapping("/allHeaders")
	public String handleAllHeaders(@RequestHeader Map headersMap) {
		System.out.println(headersMap) ;
		return "Finish" ;
	}
	
	
	
	
}
