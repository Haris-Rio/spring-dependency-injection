package com.springframework.sdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishServiceImpl implements GreetingService{

	@Override
	public String sayGreetings() {
		
		return "Hola Mundo - Spanish";
	}
}
