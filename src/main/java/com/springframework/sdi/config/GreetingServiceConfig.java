package com.springframework.sdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.springframework.sdi.repositories.EnglishGreetingRepositoryImpl;
import com.springframework.sdi.repositories.EnglishGreetingsRepository;
import com.springframework.sdi.service.ConstructorGreetingServiceImpl;
import com.springframework.sdi.service.I18nEnglishServiceImpl;
import com.springframework.sdi.service.I18nSpanishServiceImpl;
import com.springframework.sdi.service.PrimaryGreetingServiceImpl;
import com.springframework.sdi.service.PropertyGreetingServiceImpl;
import com.springframework.sdi.service.SetterGreetingServiceImpl;

@Configuration
public class GreetingServiceConfig {
	
	@Profile("ES")
	@Bean("i18nService")
	I18nSpanishServiceImpl i18nSpanishServiceImpl() {
		return new I18nSpanishServiceImpl();
	}
	
	@Bean
	EnglishGreetingsRepository englishGreetingsRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile({"EN","default"})
	@Bean("i18nService")
	I18nEnglishServiceImpl i18nEnglishServiceImpl(EnglishGreetingsRepository englishGreetingsRepository) {
		return new I18nEnglishServiceImpl(englishGreetingsRepository);
	}
	
	@Primary
	@Bean
	PrimaryGreetingServiceImpl primaryGreetingServiceImpl() {
		return new PrimaryGreetingServiceImpl();		
	}

	@Bean
	ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
		return new ConstructorGreetingServiceImpl();
	}
	
	@Bean
	PropertyGreetingServiceImpl propertyGreetingServiceImpl() {
		return new PropertyGreetingServiceImpl();
	}
	
	@Bean
	SetterGreetingServiceImpl setterGreetingServiceImpl() {
		return new SetterGreetingServiceImpl();
	}
	
}
