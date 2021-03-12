package com.springframework.sdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframework.sdi.service.ConstructorGreetingServiceImpl;

public class SetterInjectedControllerTest {

	public SetterInjectedController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingServiceImpl());
	}
	
	@Test
	public void getGreetingsTest() {
		System.out.println(controller.getGreetings());
	}
}
