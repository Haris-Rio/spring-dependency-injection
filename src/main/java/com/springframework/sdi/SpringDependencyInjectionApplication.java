package com.springframework.sdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.springframework.sdi.config.SdiConfiguration;
import com.springframework.sdi.config.SdiConstructorConfig;
import com.springframework.sdi.controller.ConstructorInjectedController;
import com.springframework.sdi.controller.I18nController;
import com.springframework.sdi.controller.MyController;
import com.springframework.sdi.controller.PetController;
import com.springframework.sdi.controller.PropertyInjectedController;
import com.springframework.sdi.controller.SetterInjectedController;
import com.springframework.sdi.datasource.FakeDataSource;
import com.springframework.sdi.service.PrototypeBean;
import com.springframework.sdi.service.SingletonBean;

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
		
		System.out.println("----------- Bean Scopes -----------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyBean());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyBean());
		
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyBean());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyBean());
		
		System.out.println("----------- Fake Data Source ----------");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());
		
		System.out.println("----------- Config Property bean ----------");
		SdiConfiguration sdiConfiguration = ctx.getBean(SdiConfiguration.class);
		System.out.println(sdiConfiguration.getUsername());
		System.out.println(sdiConfiguration.getPassword());
		System.out.println(sdiConfiguration.getJdbcurl());
		
		System.out.println("----------- Constructor Binding ----------");
		SdiConstructorConfig sdiConstructorConfig = ctx.getBean(SdiConstructorConfig.class);
		System.out.println(sdiConstructorConfig.getUsername());
		System.out.println(sdiConstructorConfig.getPassword());
		System.out.println(sdiConstructorConfig.getJdbcurl());
		
	}

}
