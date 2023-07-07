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
	
	public String getUsername() { return this.username ; }
	public String getPassword() { return this.password ; }
	public Boolean getGender() { return this.gender ; }
	public Integer getAge() { return this.age ; }
}
