package com.sun.ch03.model;

import lombok.AllArgsConstructor ;
import lombok.Data ;

import java.time.LocalDate ;
import java.util.List;

@AllArgsConstructor
@Data
public class User {
	private String username ;
	private String password ;
	private Boolean gender ;
	private Integer age ;
	private LocalDate birthday ;
	private List<String> interests ;
	
	public User(String username, String password, Boolean gender, Integer age, LocalDate birthday, List<String> interests) {
		this.username = username ;
		this.password = password ;
		this.gender = gender ;
		this.age = age ;
		this.birthday = birthday ;
		this.interests = interests ;
		
	}
	
	public String getUsername() { return this.username ; }
	public String getPassword() { return this.password ; }
	public Boolean getGender() { return this.gender ; }
	public Integer getAge() { return this.age ; }
}
