package com.shubham_week1.introToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cakeBaker {
    @Autowired
    FrostingType froster;

    @Autowired
    SyrupType syrup;


    public String bakeCake(){

        String ans = froster.getFrostingType() + syrup.getSyrupType();
        return ans;


    }
}
