package com.kognitivsolutions.learn.springprofessional.beans;

import java.util.Random;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
  private final int randomInt = new Random().nextInt(101);

  public int getRandomInt() {
    return randomInt;
  }
}
