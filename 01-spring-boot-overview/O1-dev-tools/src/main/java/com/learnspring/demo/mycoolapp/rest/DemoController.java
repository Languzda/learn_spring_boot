package com.learnspring.demo.mycoolapp.rest;

import com.learnspring.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    // constructor injection
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach coach, @Qualifier("baseballCoach") Coach anotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = coach;
        this.anotherCoach = anotherCoach;
    }
//    @Autowired
//    public DemoController(Coach coach) {
//        myCoach = coach;
//    }

    // setter injection
//    @Autowired
//    public void setMyCoach(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/check")
    public String check() {
       return "myCoach & anotherCoach are the same bean?: " + (myCoach==anotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
