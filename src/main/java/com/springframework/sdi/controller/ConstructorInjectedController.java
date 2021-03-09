package com.springframework.sdi.controller;

import com.springframework.sdi.service.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
