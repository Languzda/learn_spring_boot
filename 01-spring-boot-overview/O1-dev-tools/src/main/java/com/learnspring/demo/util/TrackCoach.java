package com.learnspring.demo.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach extends BaseCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Track Coach practise";
    }
}
