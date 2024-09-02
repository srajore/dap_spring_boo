package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	// http://localhost:8080/
	
	@GetMapping("/")
	public String sayHello() {
		return "<h2> Hello User</h2>";
	}

}
