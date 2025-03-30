package com.learnspring.demo.mycoolapp.config;

import com.learnspring.demo.util.Coach;
import com.learnspring.demo.util.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach() ;
    }
}
