package com.zensar.spring_core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component

public class Person {

	@Value("${id}")
	private int id;

	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;

	@Autowired  //co,setter // Refection mac.
	private Address address;

	public Person() {
		super();
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person(Address address) {
		super();
		this.address = address;
		System.out.println("public Person(Address address)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("public void setId(int id)");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	// @Autowired //filed
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("public void setAddress(Address address) ");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
