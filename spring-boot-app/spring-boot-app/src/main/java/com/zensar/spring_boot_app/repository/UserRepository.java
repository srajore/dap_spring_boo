package com.zensar.spring_boot_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.spring_boot_app.entity.Person;

public interface UserRepository extends JpaRepository<Person,Integer>{

}
