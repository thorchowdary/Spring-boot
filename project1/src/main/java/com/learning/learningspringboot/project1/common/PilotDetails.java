package com.learning.learningspringboot.project1.common;

import com.learning.learningspringboot.project1.common.Pilot;
import org.springframework.stereotype.Component;

@Component
public class PilotDetails implements Pilot {

    public PilotDetails(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getPilotDetils() {
        return "Pilot Name: Tharun";
    }
}
