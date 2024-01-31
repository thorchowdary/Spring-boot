package com.learning.learningspringboot.project1.rest;

import com.learning.learningspringboot.project1.common.Coach;
import com.learning.learningspringboot.project1.common.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    private Pilot pilot;

    //constructor injection
    //define constructor for constructor injection
    /** When we have more than one different implements methods spring will get confused
        which one to call so we use Qualifiers
     **/
    /**
     * Other way of doing is Using @Primary
     * if we use @Primary annotation it will take it as priority
     * but we can use only on primary, if we use multiple Primary's spring will get confused
     *
     * if we use @Qualifiers and @Primary at same time @Qualifiers is high priority
     * **/
    @Autowired
    public DemoController(@Qualifier("space") Coach theCoach,
                          @Qualifier("cricketCoach")Coach theAnotherCoach){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    //setter injection
    @Autowired
    public void setMethod(Pilot thePilot){
        pilot = thePilot;
    }
    @GetMapping("/getWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/pilotName")
    public String getPilotName(){
        return pilot.getPilotDetils();
    }
}
