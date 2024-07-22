package com.zensar.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring_core.beans.Person;
import com.zensar.spring_core.config.JavaConfig;

public class App {
	public static void main(String[] args) {
		// ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");

		// BeanFactory beanFactory=new FileSystemXmlApplicationContext("beans.xml");

		Person person1 = context.getBean("person", Person.class);

		System.out.println(person1);

	}
}
