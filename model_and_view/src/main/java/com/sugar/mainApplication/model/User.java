package com.sugar.mainApplication.model;

public class User {
	private String name ;
	private Integer age ;
	public User(String name, Integer age) {
		this.name = name ;
		this.age = age ;
	}
	public String toString() {
		return String.format("name=%s, age=%d", this.name, this.age) ;
	}
	
}