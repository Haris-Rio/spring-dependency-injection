package com.springframework.sdi.service;

public class SetterGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		
		return "Hello World - Setter";
	}
}
