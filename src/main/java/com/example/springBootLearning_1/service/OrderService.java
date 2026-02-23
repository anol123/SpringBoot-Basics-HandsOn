package com.example.springBootLearning_1.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public String getPaymentStatus(){
        return paymentService.getPayment();
    }
}
