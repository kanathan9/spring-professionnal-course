package com.kognitivsolutions.learn.springprofessional.beans;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
  private final int randomInt = new Random().nextInt(101);

  public int getRandomInt() {
    return randomInt;
  }
}
