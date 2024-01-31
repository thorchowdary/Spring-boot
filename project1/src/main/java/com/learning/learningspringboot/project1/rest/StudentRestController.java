package com.learning.learningspringboot.project1.rest;

import com.learning.learningspringboot.project1.rest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    //define @PostConstruct to load the student data -- it will execute only once the bean is initialized
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("tharun","kumar"));
        theStudents.add(new Student("kumar","tharun"));
    }
    //define endpoint for /students -- return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    //define endpoint for /students/{studentID} --- return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        //check the studentId against the list size
        if(studentId >= theStudents.size() || studentId<0 ){
            throw new StudentNotFoundException("Student Id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }
}
