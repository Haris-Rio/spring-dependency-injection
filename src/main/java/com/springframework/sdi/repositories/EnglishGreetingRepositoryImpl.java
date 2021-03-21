package com.springframework.sdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingsRepository{


	@Override
	public String getGreeting() {
		return "Hello World - EN - From Repository";
	}

	
}
