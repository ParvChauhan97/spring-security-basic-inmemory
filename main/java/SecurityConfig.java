package com.spring.security;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  public SecurityFilterChain securityFilterChain(HttpSecurity http){
  }
}
