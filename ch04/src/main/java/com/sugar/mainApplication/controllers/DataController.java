package com.sugar.mainApplication.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sugar.mainApplication.models.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class DataController {
	@GetMapping({"/", "/index"})
	public String home(Model model, HttpServletRequest request, HttpSession session, HttpServletResponse response) {
		Employee emp1 = new Employee(1, "張三", 26, 5000.00f, LocalDate.of(2021, 4, 20), Arrays.asList("Java", "C++")) ;
		Employee emp2 = new Employee(2, "李四", 23, 4000.00f, LocalDate.of(2021, 5, 5), Arrays.asList("JavaScript", "Vue")) ;
		Employee emp3 = new Employee(3, "王五", 30, 8000.00f, LocalDate.of(2021, 6, 1), Arrays.asList("架構設計", "Java")) ;
		List<Employee> emps = new ArrayList<>() ;
		emps.add(emp1) ;
		emps.add(emp2) ;
		emps.add(emp3) ;
		model.addAttribute("msg", "spring boot 有難事") ;
		model.addAttribute("emps", emps) ;
		model.addAttribute("request", request);
        model.addAttribute("session", session);
        model.addAttribute("servletContext", request.getServletContext());
        model.addAttribute("response", response);
		
		request.setAttribute("foo", "requestAttr") ;
		session.setAttribute("user", emp1) ;
		request.getServletContext().setAttribute("foo", "applicationAttr") ;
		
		return "home" ; 
	}
}
