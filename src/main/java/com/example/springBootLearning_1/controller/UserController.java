package com.example.springBootLearning_1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String test(){
        return "Springboot is running";
    }
    @GetMapping("/anol")
    public String test_1(){
        return "Hello Anol";
    }
    @GetMapping("/greet")
    public String greetUser(@RequestParam(defaultValue = "Guest") String name){
        return "Hello"+name;
    }

    @PostMapping
    public String test2(){
        return "Post method is hit";
    }


}
