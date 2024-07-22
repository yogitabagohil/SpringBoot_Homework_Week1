package com.week1.HomeWork.example.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting  implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
