package com.kognitivsolutions.learn.springprofessional.lecon1_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;

@Service
public class DateService {
  public String returnDate(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    return dtf.format(LocalDateTime.now());
  }
}
