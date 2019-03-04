package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/say")
    public String say(){
        return "say";
    }

    @RequestMapping("/eat")
    public String eat(){
        return "eat";
    }
}
