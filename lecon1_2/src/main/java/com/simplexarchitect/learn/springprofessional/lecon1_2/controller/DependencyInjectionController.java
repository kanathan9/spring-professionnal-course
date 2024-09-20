package com.simplexarchitect.learn.springprofessional.lecon1_2.controller;

import com.simplexarchitect.learn.springprofessional.lecon1_2.service.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjectionController {

  private DateService dateService;
  public DependencyInjectionController(DateService service) {
    this.dateService = service;
  }

  @GetMapping("/di/get-date")
  public String getDate(){
    return dateService.returnDate();
  }
}
