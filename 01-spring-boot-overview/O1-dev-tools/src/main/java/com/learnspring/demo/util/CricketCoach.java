package com.learnspring.demo.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach extends BaseCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }
}
