package com.springframework.sdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springframework.sdi.controller.ConstructorInjectedController;
import com.springframework.sdi.controller.I18nController;
import com.springframework.sdi.controller.MyController;
import com.springframework.sdi.controller.PetController;
import com.springframework.sdi.controller.PropertyInjectedController;
import com.springframework.sdi.controller.SetterInjectedController;

// Commenting component scan even though we have different root package because we removed spring component from that package and configuring that in java config file 
// to say the factory to produce and spring.
//@ComponentScan(basePackages = {"com.springframework.sdi", "org.springframework.pets"})
@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
		
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
