package com.springframework.sdi.controller;

import org.springframework.stereotype.Controller;

import com.springframework.sdi.service.GreetingService;

@Controller
public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreetings() {
		return greetingService.sayGreetings();
	}
}
