package com.aibeb.test.protobuf;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

	@Configuration
    public static class RestClientConfiguration {

        @Bean
        RestTemplate restTemplate(ProtobufHttpMessageConverter hmc) {
            return new RestTemplate(Arrays.asList(hmc));
        }

        @Bean
        ProtobufHttpMessageConverter protobufHttpMessageConverter() {
            return new ProtobufHttpMessageConverter();
        }
    }

	@Autowired
    private RestTemplate restTemplate;

    private int port = 8080;

    @Test
    public void paramUserShouldReturnTailoredMessage() {

        // ResponseEntity<UserProto.User> user = restTemplate.getForEntity("http://127.0.0.1:" + port + "/user", UserProto.User.class);
        System.out.println("请求参数:" );
    }
}
