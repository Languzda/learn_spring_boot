package com.learnspring.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${team.coach}")
    private String teamCoach;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World xD";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Hello World made by %s workout in %s".formatted(teamCoach,teamName);
    }

}
