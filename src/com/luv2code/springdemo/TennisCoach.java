package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

@PostConstruct
public void doSomethingOnInit() {
    System.out.println("TennisCoach: inside doSomethingOnInit()");
    
}

@PreDestroy
public void doSomethingOnDestroy() {
    System.out.println("TennisCoach: inside doSomethingOnDestroy()");

}

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }

    // @Autowired
    // public void setFortuneService(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley...";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
   
}
