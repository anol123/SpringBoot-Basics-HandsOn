package com.example.springBootLearning_1.controller;

import com.example.springBootLearning_1.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/greet/{id}")
    public String greetUser(@PathVariable int id){
        return "Hello User "+id;
    }
    @GetMapping("/greet/json")
    public User getUserJson(){
        return new User(1, "Anol",27);
    }

    @PostMapping
    public String test2(){
        return "Post method is hit";
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return user;
    }
    @PostMapping("/createHttp")
    public ResponseEntity<User> createUserHttp(@RequestBody User user){
        //return ResponseEntity.ok(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
