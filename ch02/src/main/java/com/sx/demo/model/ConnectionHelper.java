package com.sx.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionHelper {
	@Value("${jdbc.username}")
	private String username ;
	@Value("${jdbc.password}")
	private String password ;
	
	
	
}
