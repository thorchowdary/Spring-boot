package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDao {

    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    void update(Student student);
    void updateAll();
    void delete(int id);

    int deleteAll();
}
