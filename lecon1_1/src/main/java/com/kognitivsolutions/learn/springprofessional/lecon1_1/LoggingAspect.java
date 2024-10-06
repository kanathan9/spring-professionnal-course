package com.kognitivsolutions.learn.springprofessional.lecon1_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
  @Before("execution(* com.kognitivsolutions.learn.springprofessional.lecon1_1.DateService.*(..))")
  public void logBefore() {
    logger.debug("Logging BEFORE method execution");
  }

  @After("execution(* com.kognitivsolutions.learn.springprofessional.lecon1_1.DateService.*(..))")
  public void logAfter() {
    logger.debug("Logging AFTER method execution");
  }

  @Around("execution(* com.kognitivsolutions.learn.springprofessional.lecon1_1.DateService.*(..))")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    logger.debug("Logging BEFORE method execution (Around)");
    Object result = joinPoint.proceed();  // Continue with the actual method execution
    logger.debug("Logging AFTER method execution (Around)");
    return result;
  }
}
