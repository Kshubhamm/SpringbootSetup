package com.shubham_week1.introToSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "chocolate")
public class chocolateFrosting implements FrostingType{

    public String getFrostingType(){
        return "Chocolate Frost cake being prepared";
    }
}
