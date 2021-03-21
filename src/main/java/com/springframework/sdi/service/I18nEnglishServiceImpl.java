package com.springframework.sdi.service;

import com.springframework.sdi.repositories.EnglishGreetingsRepository;

public class I18nEnglishServiceImpl implements GreetingService{
	
	private final EnglishGreetingsRepository englishGreetingsRepository;
		
	public I18nEnglishServiceImpl(EnglishGreetingsRepository englishGreetingsRepository) {
		super();
		this.englishGreetingsRepository = englishGreetingsRepository;
	}

	@Override
	public String sayGreetings() {	
		return englishGreetingsRepository.getGreeting();
	}
}
