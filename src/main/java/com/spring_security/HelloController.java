package com.spring_security;



import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')") // we can also use hasAnyRole
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, user Admin";
    }


    @GetMapping("/user/hello")
    public String sayUserHello(){
            return "Hello, User";
    }

    @GetMapping("/admin/hello")
    public String sayAdminHello(){
        return "Hello, Admin";
    }
}
