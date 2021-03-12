package com.springframework.sdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sdi.service.ConstructorGreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	public ConstructorInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
	}
	
	@Test
	public void getGreetingTest() {
		System.out.println(controller.getGreetings());
	}
}
