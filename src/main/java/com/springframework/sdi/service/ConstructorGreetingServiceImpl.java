package com.springframework.sdi.service;

public class ConstructorGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		
		return "Hello World - Constructor";
	}

	
}
