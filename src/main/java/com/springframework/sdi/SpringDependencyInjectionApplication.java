package com.springframework.sdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframework.sdi.controller.ConstructorInjectedController;
import com.springframework.sdi.controller.I18nController;
import com.springframework.sdi.controller.MyController;
import com.springframework.sdi.controller.PropertyInjectedController;
import com.springframework.sdi.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("---------- I18N ----------");
		System.out.println(i18nController.sayHello());
		
		System.out.println("---------- Primary ----------");
		System.out.println(myController.sayHello());
		
		System.out.println("---------- Property ----------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());
		
		System.out.println("----------- Setter ------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());
		
		System.out.println("----------- Contructor ------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());
		
	}

}
