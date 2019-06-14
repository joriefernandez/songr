package com.fern.jorie.projectlab.songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    @Autowired
    HelloWorldController helloController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testControllerIsAutowired() {
        assertNotNull(helloController);
    }

    @Test
    public void testRequestToRootGivesHelloWorld() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Hello, world!")));
    }

    @Test
    public void testRequestToRootGivesCapitalize() throws Exception {
        mockMvc.perform(get("/capitalize/this test")).andExpect(content().string(containsString("THIS TEST")));
    }

    @Test
    public void testRequestToRootGivesReversedOneWord() throws Exception {
        mockMvc.perform(get("/reverse?sentence=test")).andExpect(content().string(containsString("test")));
    }

    @Test
    public void testRequestToRootGivesReversedWords() throws Exception {
        mockMvc.perform(get("/reverse?sentence=This is the test")).andExpect(content().string(containsString("test the is This")));
    }

}
