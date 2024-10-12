package com.kognitivsolutions.learn.springprofessional;

import com.kognitivsolutions.learn.springprofessional.beans.PrototypeBean;
import com.kognitivsolutions.learn.springprofessional.beans.RequestScopeBean;
import com.kognitivsolutions.learn.springprofessional.beans.SingletonBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBeanController {
  private RequestScopeBean requestScopeBean;
  private SingletonBean singletonBean;
  private PrototypeBean prototypeBean;
  public RequestBeanController(RequestScopeBean requestScopeBean, SingletonBean singletonBean,
      PrototypeBean prototypeBean) {
    this.requestScopeBean = requestScopeBean;
    this.singletonBean = singletonBean;
    this.prototypeBean = prototypeBean;
  }

  @GetMapping("/test-request-bean")
  public int testRequestBean() {
    return requestScopeBean.getRandomInt();
  }

  @GetMapping("/test-singleton-bean")
  public int testSingletonBean() {
    return singletonBean.getRandomInt();
  }

  @GetMapping("/test-prototype-bean")
  public int testPrototypeBean() {
    return prototypeBean.getRandomInt();
  }
}
