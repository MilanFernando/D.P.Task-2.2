package com.service2.service2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration

public class Config {
    @Bean
    public WebClient webclient(){
        return WebClient.builder().baseUrl("http://localhost:8080/service1string").build();
    }
}
