package com.zensar.spring_boot_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.spring_boot_app.entity.Person;
import com.zensar.spring_boot_app.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public void insertUser(@RequestBody Person person) {
		System.out.println();
		userService.insertUser(person);
	}

}
