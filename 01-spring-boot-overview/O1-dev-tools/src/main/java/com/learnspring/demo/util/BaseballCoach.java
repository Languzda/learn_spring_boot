package com.learnspring.demo.util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach extends BaseCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Baseball Coach practise";
    }
}
