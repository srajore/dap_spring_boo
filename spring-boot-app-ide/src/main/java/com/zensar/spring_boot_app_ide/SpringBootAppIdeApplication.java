package com.zensar.spring_boot_app_ide;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//public class SpringBootAppIdeApplication extends SpringBootServletInitializer {
public class SpringBootAppIdeApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppIdeApplication.class, args);

	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}*/
	
	

}
