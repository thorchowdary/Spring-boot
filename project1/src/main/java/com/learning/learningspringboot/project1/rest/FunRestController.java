package com.learning.learningspringboot.project1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for coach and team name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose end point for team and coach name
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return " coachName: "+coachName+" teamName: "+teamName;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    //expose endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "work hard";
    }
}
