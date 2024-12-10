package com.shubham_week1.introToSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "strawberry")
public class strawberryFrosting implements FrostingType{

    public String getFrostingType(){
        return "Strawberry Frost cake being prepared";
    }
}
