package com.shubham_week1.introToSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "shubham.env", havingValue = "production")
public class ProdDB implements DB{

    public String getData(){
        return ("Production DB data");
    }
}
