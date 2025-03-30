package com.learnspring.demo.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach extends BaseCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Tennis Coach practise";
    }
}
