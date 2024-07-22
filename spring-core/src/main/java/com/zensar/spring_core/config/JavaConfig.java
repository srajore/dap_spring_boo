package com.zensar.spring_core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zensar.spring_core.beans")
@PropertySource(value = "data.properties")
public class JavaConfig {
	
	
	//@Bean(value = "person")
	//public Person p1() {
	//	return new Person(1, "Ram", 28);
	//}

}

 