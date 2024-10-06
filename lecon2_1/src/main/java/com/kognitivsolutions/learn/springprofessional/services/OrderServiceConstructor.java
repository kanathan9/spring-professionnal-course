package com.kognitivsolutions.learn.springprofessional.services;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceConstructor implements OrderService {
  private final PaymentService paymentService;

  public OrderServiceConstructor(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public String completeOrder(){
    return paymentService.pay();
  }
}
