package com.simplexarchitect.learn.springprofessional.lecon1_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonDependencyInjectionController {
  private DateService dateService;

  public NonDependencyInjectionController() {
    this.dateService = new DateService();
  }

  @GetMapping("/get-date")
  public String getDate(){
    return dateService.returnDate();
  }
}
