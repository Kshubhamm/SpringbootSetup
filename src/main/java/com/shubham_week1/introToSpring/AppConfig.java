package com.shubham_week1.introToSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    //create a bean here
    @Bean
    @Scope("prototype")

    Apple createBean(){
        return new Apple();
    }

}
