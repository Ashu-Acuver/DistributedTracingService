package com.tracingSystem.DemoTracingService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    private final RestTemplate restTemplate;

    public DemoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello(){
        ResponseEntity<String> responseEntity = this.restTemplate.postForEntity("https://httpbin.org/post","hello, Cloud!",String.class);
        return responseEntity.getBody();
    }



}
