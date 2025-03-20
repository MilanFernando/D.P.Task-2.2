package com.service2.service2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
@RestController
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
   private final ApiConnector apiConnector;

   public String service2(){
       String service2String=apiConnector.getservice2();
       return service2String;
   }

}
