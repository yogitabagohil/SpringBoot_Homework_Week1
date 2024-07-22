package com.week1.HomeWork.example.introductionToSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ChocolateFrosting  implements  Frosting   {

    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
