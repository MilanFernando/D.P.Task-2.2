package com.service2.service2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class ApiConnector {
private final WebClient webClient;

    public String getservice2(){
        return webClient
            .get().uri("http://localhost:8080/service1string")
            .retrieve()
            .bodyToMono(String.class)
            .block();
}
}
