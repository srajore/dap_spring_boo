package com.zensar.spring_boot_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.spring_boot_app.entity.Person;
import com.zensar.spring_boot_app.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void insertUser(Person person) {
		userRepository.save(person);

	}

}
