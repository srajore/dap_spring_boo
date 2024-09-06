package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.User;
import com.zensar.repository.UserRepository;

@RestController
public class HomeResource {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder encoder;

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}

	@GetMapping("/user")
	//@PreAuthorize("hasAuthority('ROLE_USER')")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}

	@GetMapping("/admin")
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	//@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}

	@PostMapping("/addUser")
	public String insertUser(@RequestBody User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
		return "User added successfully ";
	}
}