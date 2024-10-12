package com.kognitivsolutions.learn.springprofessional.beans;

import jakarta.annotation.PostConstruct;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBeanInitilisation implements InitializingBean {
  private final Logger logger = LoggerFactory.getLogger(PrototypeBeanInitilisation.class);
  private int randomInt = new Random().nextInt(101);

  @PostConstruct
  public void init(){
    this.randomInt = 10;
    logger.info("Running @PostContruct method.");
  }
  public int getRandomInt() {
    return randomInt;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    this.randomInt = 15;
    logger.info("Running afterPropertiesSet method.");
  }
}
