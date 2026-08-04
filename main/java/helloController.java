package com.spring.security;

public class helloController {

   @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
   @GetMapping("/hello")
   public String SayHello() {
      return "Hello Security";
   }

    @PreAuthorize("hasRole('ADMIN')")
   @GetMapping("/admin/hello")
   public String sayAdminHello() {
      return "Hello, admin";
   }
  
}
