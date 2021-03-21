package com.springframework.sdi.service;

public class PrimaryGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		
		return "Hello World - PRIMARY";
	}
	
}
