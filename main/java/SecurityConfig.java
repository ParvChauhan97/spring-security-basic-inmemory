package com.spring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

  @Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) {
  http.authorizeHttpRequests(authorizeRequests ->
                authorizeRequests.requestMatchers("/admin/**").hasRole("ADMIN")
                                .requestMatchers("/user/**").hasRole("USER").
                anyRequest().authenticated());

        http.httpBasic(Customizer.withDefaults());
        return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    
    UserDetails user1 = User.withUsername("User1")
                .password("{noop}password123")
                .roles("USER")
                .build();

    UserDetails user2 = User.withUsername("User2")
                .password("{noop}password2")
                .roles("USER")
                .build();

    UserDetails admin = User.withUsername("Admin")
                .password("{noop}adminPassword")
                .roles("ADMIN")
                .build();

    return new InMemoryUserDetailsManager(user1, user2, admin);
  }
}
