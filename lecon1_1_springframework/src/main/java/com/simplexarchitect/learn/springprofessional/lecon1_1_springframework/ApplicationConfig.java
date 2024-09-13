package com.simplexarchitect.learn.springprofessional.lecon1_1_springframework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.simplexarchitect.learn.springprofessional.lecon1_1_springframework")
@EnableWebMvc
public class ApplicationConfig {


}
