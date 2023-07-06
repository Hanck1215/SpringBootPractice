package com.sx.demo.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConnectionHelperTest {
	@Autowired
	private ConnectionHelper connHelper ;
	@Test
	void test() {
		System.out.println(connHelper.getUsername()) ;
		System.out.println(connHelper.getPassword()) ;
	}
}
