package com.example.springBootLearning_1.controller;

import com.example.springBootLearning_1.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService= orderService;
    }
    @GetMapping("/status")
    public ResponseEntity<String> checkOrderStatus(){
        return ResponseEntity.status(HttpStatus.OK).body("From Controller: "+orderService.getPaymentStatus());
    }

}
