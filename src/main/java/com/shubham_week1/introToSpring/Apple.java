package com.shubham_week1.introToSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.sql.SQLOutput;

//import org.springframework.stereotype.Component;
//
//@Component
public class Apple {

    public void getApple(){
        System.out.println("I am eating apple");
    }

    @PostConstruct
    void checkInitialisation()
    {
        System.out.println("Apple bean is initialised");
    }

    @PreDestroy
    void checkDeletion(){
        System.out.println("Apple bean is deinitialised");

    }
}

