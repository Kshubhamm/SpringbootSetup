package com.shubham_week1.introToSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "strawberry")
public class strawberrySyrup implements SyrupType{

    public String getSyrupType(){
        return "Strawberry Syrup cake being prepared";
    }
}

