package com.springframework.sdi.controller;

import org.springframework.stereotype.Controller;

import com.springframework.sdi.service.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreetings();
	}
}
