package com.zensar.spring_boot_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
		// http://localhost:8080/  GET

		@RequestMapping("/")
		public String helloSpringBoot() {
			return "<h2> Learning something new,Welcome to Spring Boot </h2>";
		}
		
		

}
