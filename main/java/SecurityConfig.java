package com.spring.security;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http){

  }
}
