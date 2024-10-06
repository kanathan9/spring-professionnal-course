package com.kognitivsolutions.learn.springprofessional.services;

import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentService implements PaymentService{

  @Override
  public String pay() {
    return "Paiement par Carte de Crédit Complété!";
  }
}
