package com.spring.security;

public class helloController {

   @GetMapping("/hello")
   public String SayHello() {
      return "Hello Security";
   }
  
}
