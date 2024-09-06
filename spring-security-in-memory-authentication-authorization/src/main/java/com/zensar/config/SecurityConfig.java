package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {

		UserDetails admin = User.withUsername("tom").password(encoder.encode("tom@123")).roles("ADMIN").build();

		UserDetails user = User.withUsername("jerry").password(encoder.encode("jerry@123")).roles("USER").build();

		return new InMemoryUserDetailsManager(admin, user);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// In Spring Boot 3.0.1
	/*
	 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
	 * throws Exception { return http.csrf().disable() .authorizeHttpRequests()
	 * .requestMatchers("/").permitAll() .and()
	 * .authorizeHttpRequests().requestMatchers("/admin","/user") .authenticated()
	 * .and() .formLogin() .and() .build();
	 * 
	 * }
	 */

	// In Spring Boot 3.1.3
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth.requestMatchers("/").permitAll())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/admin", "/user").authenticated())
				.formLogin((form) -> form.permitAll());
		return http.build();

	}

}
