package com.week1.HomeWork.example.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
