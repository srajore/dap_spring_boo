package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {

		UserDetails tom = User.withUsername("tom").password(encoder.encode("tom@123")).roles("ADMIN").build();

		UserDetails jerry = User.withUsername("jerry").password(encoder.encode("jerry@123")).roles("USER").build();

		return new InMemoryUserDetailsManager(tom, jerry);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
