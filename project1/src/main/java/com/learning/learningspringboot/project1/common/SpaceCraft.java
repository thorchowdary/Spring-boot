package com.learning.learningspringboot.project1.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class SpaceCraft implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do gravity test daily";
    }
}
