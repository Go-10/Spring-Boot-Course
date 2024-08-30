package com.example.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("Welcome to Spring boot demo \n");

		// Creating object of Alien class using java constructor
		// Alien alien1 = new Alien();
		// alien1.code();

		// Creating object/bean of Alien class using IOC container (Inversion of control).
		// ICO Container generally contains beans of all class. It will create, maintain and clear the beans.
		// We do not need to worry about beans/objects, sprint will do this
		Alien alien2 = container.getBean(Alien.class);
		alien2.code();
		
	}

}
