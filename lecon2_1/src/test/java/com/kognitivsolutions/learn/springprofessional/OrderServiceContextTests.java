package com.kognitivsolutions.learn.springprofessional;

import com.kognitivsolutions.learn.springprofessional.services.OrderServiceConstructor;
import com.kognitivsolutions.learn.springprofessional.services.PaymentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceContextTests {

  @Test
  void testOrderServiceContext(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Lecon21Application.class);
    OrderServiceConstructor orderService = new OrderServiceConstructor(applicationContext.getBean(PaymentService.class));

    String paymentText = "Paiement par Carte de Crédit Complété!";
    Assertions.assertEquals(paymentText, orderService.completeOrder());
  }
}
