package com.spring_security;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
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
