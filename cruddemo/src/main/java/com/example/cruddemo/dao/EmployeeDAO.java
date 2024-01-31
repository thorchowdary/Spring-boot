package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> finaAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);

    void deleteEmployeeById(int theId);
}
