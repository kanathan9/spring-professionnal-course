package com.kognitivsolutions.learn.springprofessional.configuration;

import com.kognitivsolutions.learn.springprofessional.services.BillingService;
import com.kognitivsolutions.learn.springprofessional.services.NonStudentBillingService;
import com.kognitivsolutions.learn.springprofessional.services.StudentBillingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BillingConfiguration {
  private Boolean isStudent = true;
  @Bean
  BillingService getBillingService(){
    if(this.isStudent){
      return new StudentBillingService();
    }else {
      return new NonStudentBillingService();
    }
  }
}
