package com.zensar.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.zensar.filter.JwtFilter;
import com.zensar.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	/*
	 * @Bean public UserDetailsService userDetailsService(PasswordEncoder encoder) {
	 * 
	 * UserDetails admin =
	 * User.withUsername("tom").password(encoder.encode("tom@123")).roles("ADMIN").
	 * build();
	 * 
	 * UserDetails user =
	 * User.withUsername("jerry").password(encoder.encode("jerry@123")).roles("USER"
	 * ).build();
	 * 
	 * return new InMemoryUserDetailsManager(admin, user);
	 * 
	 * }
	 */
	@Autowired
	private JwtFilter filter;

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();

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
		http.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/", "/addUser","/authenticate").permitAll())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/admin", "/user").authenticated())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.formLogin((form) -> form.permitAll());
		
		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		return http.build();

	}

	/*
	 * @Bean public AuthenticationProvider authenticationProvider() {
	 * DaoAuthenticationProvider authenticationProvider = new
	 * DaoAuthenticationProvider();
	 * authenticationProvider.setUserDetailsService(userDetailsService());
	 * authenticationProvider.setPasswordEncoder(passwordEncoder()); return
	 * authenticationProvider; }
	 */
	
	
	@Bean
	public AuthenticationManager  authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return new ProviderManager(authenticationProvider);
	}

}
