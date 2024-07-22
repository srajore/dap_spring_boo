package com.zensar.spring_boot_app_ide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.zensar.spring_boot_app_ide.dto.ProductDto;

@SpringBootApplication
public class SpringBootAppIdeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppIdeApplication.class, args);

	}

}
