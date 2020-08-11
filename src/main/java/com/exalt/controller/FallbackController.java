package com.exalt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/companyFallBack")
    public Mono<String> companyServiceFallBack(){
        return Mono.just("Company service down, try again later");
    }
    @RequestMapping("/managementFallBack")
    public Mono<String> managementServiceFallBack(){
        return Mono.just("management system service down, try again later");
    }
}
