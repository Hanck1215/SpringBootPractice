package com.sugar.mainApplication.models;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
	private Integer no ;
	private String name ;
	private Integer age ;
	private Float salary ;
	private LocalDate hireDay ;
	private List<String> skills ;
	
	public Employee(int i, String string, int j, float f, LocalDate of, List<String> asList) {
		this.no = i ;
		this.name = string ;
		this.age = j ;
		this.salary = f ;
		this.hireDay = of ;
		this.skills = asList ;
	}
}
