package com.learnspring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of out related advices for logging

//    @Before("execution(public void add*())")
//    @Before("execution(public void com.learnspring.aopdemo.dao.AccountDAOImpl.addAccount())"))
//    @Before("execution(void add*())"))
//    @Before("execution( * add*())"))
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n ====>>> Executing @Before advice on addAccount()");
    }
}
