package com.learning.learningspringboot.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(

		//by default spring only does component scan which are under the main package which we created while creating the project
		// so if we want to use other classes which are in different package we need to define the those packages in blow way
		scanBasePackages = {	"com.learning.util","com.learning.learningspringboot.project1","com.learning.learningspringboot.project1.common.Pilot"}
)
public class Project1Application {

	public static void main(String[] args) {

		SpringApplication.run(Project1Application.class, args);
	}

}
