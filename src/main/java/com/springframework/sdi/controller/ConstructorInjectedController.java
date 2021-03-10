package com.springframework.sdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.sdi.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	@Autowired //as for as contructor injected is concerned @Autowired is not mandatory it works even without @autowired.
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
