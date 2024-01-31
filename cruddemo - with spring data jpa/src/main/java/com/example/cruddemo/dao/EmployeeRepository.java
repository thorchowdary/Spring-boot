package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<entity, primarykey>
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //that's it no need t write any code
}
