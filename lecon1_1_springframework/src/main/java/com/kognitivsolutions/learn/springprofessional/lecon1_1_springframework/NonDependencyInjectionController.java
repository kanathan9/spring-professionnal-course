package com.kognitivsolutions.learn.springprofessional.lecon1_1_springframework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonDependencyInjectionController {
  private final DateService dateService;

  public NonDependencyInjectionController() {
    this.dateService = new DateService();
  }

  @GetMapping("/get-date")
  public String getDate(){
    return dateService.returnDate();
  }
}
