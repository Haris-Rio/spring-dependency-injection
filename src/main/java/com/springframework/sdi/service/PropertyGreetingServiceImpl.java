package com.springframework.sdi.service;

public class PropertyGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		
		return "Hello World - Property";
	}
}
