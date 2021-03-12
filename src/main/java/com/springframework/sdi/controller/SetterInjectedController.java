package com.springframework.sdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.sdi.service.GreetingService;

@Controller
public class SetterInjectedController {

	@Qualifier("setterGreetingServiceImpl")
	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
