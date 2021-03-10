package com.springframework.sdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		
		return "Hello World";
	}

	
}
