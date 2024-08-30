package com.example.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		System.out.println("Welcome to Spring boot demo \n");

		// Creating object of Alien class
		Alien alien = new Alien();
		alien.code();
	}

}
