package com.springframework.sdi.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
	
	public PrototypeBean() {
		System.out.println("Creating a prototype bean #########");
	}

	public String getMyBean() {
		return "I'm a Prototype Bean";
	}
}
