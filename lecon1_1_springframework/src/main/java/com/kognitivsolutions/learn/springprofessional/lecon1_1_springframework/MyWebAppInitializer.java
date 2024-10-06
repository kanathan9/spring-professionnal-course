package com.kognitivsolutions.learn.springprofessional.lecon1_1_springframework;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebAppInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.setConfigLocation("com.simplexarchitect.learn.springprofessional.lecon1_1_springframework.ApplicationConfig");

    // Register DispatcherServlet
    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("lecon1_1_dispatcher",
        new DispatcherServlet(context));
    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping("/");
  }
}
