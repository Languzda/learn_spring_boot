package com.learnspring.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach extends BaseCoach implements Coach {


    @PostConstruct
    public void init() {
        System.out.println("TennisCoach init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TennisCoach destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis Coach practise";
    }
}
