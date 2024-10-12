package com.kognitivsolutions.learn.springprofessional;

import com.kognitivsolutions.learn.springprofessional.beans.PrototypeBean;
import com.kognitivsolutions.learn.springprofessional.beans.PrototypeBeanInitilisation;
import com.kognitivsolutions.learn.springprofessional.beans.SingletonBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTests {
  private final Logger logger = LoggerFactory.getLogger(BeanScopeTests.class);
  @Test
  void prototypeBeanTest(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Lecon21Application.class);
    PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
    PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
    PrototypeBean prototypeBean3 = applicationContext.getBean(PrototypeBean.class);

    logger.info("Bean1 random int={}", prototypeBean1.getRandomInt());
    logger.info("Bean2 random int={}", prototypeBean2.getRandomInt());
    logger.info("Bean3 random int={}", prototypeBean3.getRandomInt());

    Assertions.assertNotEquals(prototypeBean1, prototypeBean2);
  }

  @Test
  void singletonBeanTest(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Lecon21Application.class);
    SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
    SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
    SingletonBean singletonBean3 = applicationContext.getBean(SingletonBean.class);

    logger.info("Bean1 random int={}", singletonBean1.getRandomInt());
    logger.info("Bean2 random int={}", singletonBean2.getRandomInt());
    logger.info("Bean3 random int={}", singletonBean3.getRandomInt());

    Assertions.assertEquals(singletonBean1, singletonBean2);
  }

  @Test
  void prototypeBeanInitilisationTest(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Lecon21Application.class);
    PrototypeBeanInitilisation prototypeBean1 = applicationContext.getBean(PrototypeBeanInitilisation.class);
    PrototypeBeanInitilisation prototypeBean2 = applicationContext.getBean(PrototypeBeanInitilisation.class);
    PrototypeBeanInitilisation prototypeBean3 = applicationContext.getBean(PrototypeBeanInitilisation.class);

    logger.info("Bean1 random int={}", prototypeBean1.getRandomInt());
    logger.info("Bean2 random int={}", prototypeBean2.getRandomInt());
    logger.info("Bean3 random int={}", prototypeBean3.getRandomInt());

    Assertions.assertNotEquals(prototypeBean1, prototypeBean2);
  }
}
