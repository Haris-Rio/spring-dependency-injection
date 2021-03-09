package com.springframework.sdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sdi.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	public PropertyInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}
	
	
	@Test
	public void getGreetingsTest() {
		System.out.println(controller.getGreetings());
	}
}
