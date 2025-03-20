package com.service2.service2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StringController {
    private final Service service;
    @GetMapping("/service2String")
    public String service2String() {
        return "hi.this is server 2";
    }
    @GetMapping("/service2")
    public String service2() {
        return service.service2();
    }
}
