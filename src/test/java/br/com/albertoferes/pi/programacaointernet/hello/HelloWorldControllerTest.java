package br.com.albertoferes.pi.programacaointernet.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorldControllerTest.class)
public class HelloWorldControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void testHelloWorldController() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("<h1>Hello World a partir do Spring Boot!</h1>"))
//                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN));
    }
}
