package com.github.alochym.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
// https://mkyong.com/spring-boot/spring-boot-test-unable-to-autowired-mockmvc/
@AutoConfigureMockMvc // need this in Spring Boot test
public class HelloWorldTest {
    private static final String END_POINT_PATH = "/hello";
    private static final String END_POINT_PATH_JSON = "/hello-json";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void HelloWorldStringTest() throws Exception {
        this.mockMvc.perform(get(END_POINT_PATH))
                .andExpect(status().isOk());
    }

    @Test
    void HelloWorldStringJsonTest() throws Exception {
        this.mockMvc.perform(get(END_POINT_PATH_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    void HelloWorldStringJsonBodyTest() throws Exception {
        this.mockMvc.perform(get(END_POINT_PATH_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.message", is("Hello World REST API")))
                .andExpect(status().isOk());
    }
}
