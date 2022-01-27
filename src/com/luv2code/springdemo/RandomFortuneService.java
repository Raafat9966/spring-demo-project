package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        
        String[] fortunes = {"Today is your lucky day!", "You will be very successful today!", "You will be happy today!"};

        Random myRandom = new Random();
        
        int index = myRandom.nextInt(fortunes.length);
        
        return fortunes[index];
    }
    
}
