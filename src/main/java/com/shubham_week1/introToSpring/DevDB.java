package com.shubham_week1.introToSpring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "shubham.env", havingValue = "development")
public class DevDB implements DB
{
    public String getData(){
        return ("Dev DB data");
    }
}
