package com.springframework.sdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sdi.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	public ConstructorInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void getGreetingTest() {
		System.out.println(controller.getGreetings());
	}
}
