package com.aws.admin;

import com.aws.admin.controllers.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MainController.class)
public class MainControllerTests {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetHome() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }
    @Test
    public void testNotFound() throws Exception {
        mockMvc.perform(get("/no-path"))
                .andExpect(status().isNotFound());
    }


}
