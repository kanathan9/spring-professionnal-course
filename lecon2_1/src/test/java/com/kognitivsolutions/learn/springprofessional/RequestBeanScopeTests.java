package com.kognitivsolutions.learn.springprofessional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class RequestBeanScopeTests {
  @Autowired
  private WebApplicationContext webApplicationContext;

  private MockMvc mockMvc;

  @Test
  void testRequestScopedBean() throws Exception {
    // Create MockMvc to simulate an HTTP request
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    // Simulate the first HTTP request
    mockMvc.perform(MockMvcRequestBuilders.get("/test-request-bean"))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print());
    mockMvc.perform(MockMvcRequestBuilders.get("/test-request-bean"))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print());
  }

  @Test
  void testSingletonScopedBean() throws Exception {
    // Create MockMvc to simulate an HTTP request
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    // Simulate the first HTTP request
    mockMvc.perform(MockMvcRequestBuilders.get("/test-singleton-bean"))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print());
    mockMvc.perform(MockMvcRequestBuilders.get("/test-singleton-bean"))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print());
  }

  @Test
  void testPrototypeScopedBean() throws Exception {
    // Create MockMvc to simulate an HTTP request
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    // Simulate the first HTTP request
    mockMvc.perform(MockMvcRequestBuilders.get("/test-prototype-bean"))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print());
    mockMvc.perform(MockMvcRequestBuilders.get("/test-prototype-bean"))
        .andExpect(status().isOk())
        .andDo(MockMvcResultHandlers.print());
  }
}
