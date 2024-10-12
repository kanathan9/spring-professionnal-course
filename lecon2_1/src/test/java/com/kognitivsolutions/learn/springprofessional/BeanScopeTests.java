package com.kognitivsolutions.learn.springprofessional;

import com.kognitivsolutions.learn.springprofessional.beans.PrototypeBean;
import com.kognitivsolutions.learn.springprofessional.beans.SingletonBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTests {
  @Test
  void prototypeBeanTest(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Lecon21Application.class);
    PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
    PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
    PrototypeBean prototypeBean3 = applicationContext.getBean(PrototypeBean.class);

    System.out.println("Bean1 random int="+prototypeBean1.getRandomInt());
    System.out.println("Bean2 random int="+prototypeBean2.getRandomInt());
    System.out.println("Bean3 random int="+prototypeBean3.getRandomInt());

    Assertions.assertNotEquals(prototypeBean1, prototypeBean2);
  }

  @Test
  void singletonBeanTest(){
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Lecon21Application.class);
    SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
    SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
    SingletonBean singletonBean3 = applicationContext.getBean(SingletonBean.class);

    System.out.println("Bean1 random int="+singletonBean1.getRandomInt());
    System.out.println("Bean2 random int="+singletonBean2.getRandomInt());
    System.out.println("Bean3 random int="+singletonBean3.getRandomInt());

    Assertions.assertEquals(singletonBean1, singletonBean2);
  }
}
