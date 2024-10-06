package com.kognitivsolutions.learn.springprofessional;

import com.kognitivsolutions.learn.springprofessional.services.OrderServiceConstructor;
import com.kognitivsolutions.learn.springprofessional.services.OrderServiceSetter;
import com.kognitivsolutions.learn.springprofessional.services.PaymentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTests {
  @Mock
  PaymentService fakePaymentService;
  private final String paymentText = "Test de paiement complété";

  @Test
  void testOrderServiceConstructor(){
    Mockito.when(fakePaymentService.pay()).thenReturn(paymentText);
    OrderServiceConstructor orderService = new OrderServiceConstructor(fakePaymentService);

    Assertions.assertEquals(paymentText, orderService.completeOrder());
  }

  @Test
  void testOrderServiceSetter(){
    Mockito.when(fakePaymentService.pay()).thenReturn(paymentText);
    OrderServiceSetter orderService = new OrderServiceSetter();
    orderService.setPaymentService(fakePaymentService);

    Assertions.assertEquals(paymentText, orderService.completeOrder());
  }
}
