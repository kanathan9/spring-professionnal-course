package com.kognitivsolutions.learn.springprofessional.lecon1_1_springframework;


import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Lecon11SpringframeworkApplication {

  public static void main(String[] args) throws LifecycleException {
    Tomcat tomcat = new Tomcat();
    tomcat.setPort(8080);

    tomcat.getConnector();

    // Define the base directory (can be any temporary location)
    tomcat.setBaseDir(".");

    tomcat.addWebapp("/", System.getProperty("java.io.tmpdir"));

    // Start the Tomcat server
    tomcat.start();

    // Keep the server running
    tomcat.getServer().await();
  }

}
