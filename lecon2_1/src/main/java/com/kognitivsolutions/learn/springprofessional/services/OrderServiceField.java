package com.kognitivsolutions.learn.springprofessional.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceField implements OrderService {
  @Autowired
  private PaymentService paymentService;

  public String completeOrder(){
    return paymentService.pay();
  }
}
