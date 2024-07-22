package com.week1.HomeWork.example.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
   @Autowired
    Frosting frosting;
    @Autowired
     Syrup syrup;

    public void bakeCake() {
        System.out.println("Baking a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType() + ".");
    }
}
