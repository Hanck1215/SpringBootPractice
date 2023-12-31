package com.sx.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="jdbc")
public class ConnectionHelper {
	
	private String username ;
	private String password ;
	
	public String getUsername() { return username ; }
	
	public String getPassword() { return password ; }
	
	public void setUsername(String username) { this.username = username ; }
	
	public void setPassword(String password) { this.password = password ; }
	
}
