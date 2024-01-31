package com.learning.learningspringboot.project1.config;

import com.learning.learningspringboot.project1.common.Coach;
import com.learning.learningspringboot.project1.common.PilotDetails;
import com.learning.learningspringboot.project1.common.SpaceCraft;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("space")
    public Coach getCoach(){
       return new SpaceCraft();
    }
}
