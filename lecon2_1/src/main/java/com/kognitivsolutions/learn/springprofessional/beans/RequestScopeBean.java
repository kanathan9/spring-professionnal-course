package com.kognitivsolutions.learn.springprofessional.beans;

import java.util.Random;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeBean {
  private final int randomInt = new Random().nextInt(101);

  public int getRandomInt() {
    return randomInt;
  }
}
