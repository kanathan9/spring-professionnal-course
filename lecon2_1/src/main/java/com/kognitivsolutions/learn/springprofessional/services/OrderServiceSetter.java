package com.kognitivsolutions.learn.springprofessional.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceSetter implements OrderService {
  private PaymentService paymentService;

  @Autowired
  public void setPaymentService(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public String completeOrder(){
    return paymentService.pay();
  }
}
