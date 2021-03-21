package com.springframework.sdi.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Creating a Singleton Bean $$$$$$$");
	}

	public String getMyBean() {
		return "I'm a Singleton Bean";
	}
}
