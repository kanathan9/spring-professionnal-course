package com.kognitivsolutions.learn.springprofessional.beans;

import jakarta.annotation.PreDestroy;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean implements DisposableBean {
  private final Logger logger = LoggerFactory.getLogger(SingletonBean.class);
  private final int randomInt = new Random().nextInt(101);

  public int getRandomInt() {
    return randomInt;
  }

  @PreDestroy
  public void preDestroy(){
    logger.info("Running @PreDestroy method.");
  }

  @Override
  public void destroy() throws Exception {
    logger.info("Running destroy method.");
  }
}
