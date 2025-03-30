package com.learnspring.demo.util;

public class SwimCoach extends BaseCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim Coach practise";
    }
}
