package com.springframework.sdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.sdi.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	

	//as for as contructor injected is concerned @Autowired is not mandatory it works even without @autowired.
	private final GreetingService greetingService;

	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}

}
