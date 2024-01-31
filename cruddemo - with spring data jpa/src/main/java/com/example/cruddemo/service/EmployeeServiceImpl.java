package com.example.cruddemo.service;


import com.example.cruddemo.dao.EmployeeRepository;
import com.example.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
       this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theemployee = null;
        if(result.isPresent()){
            theemployee = result.get();
        }
        else {
            throw new RuntimeException("Did not find id - " + theId);
        }
        return theemployee;
    }

    //@Transactional no need to add @Transactional since JPA repository provides this functionality
    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    //@Transactional no need to add @Transactional since JPA repository provides this functionality
    @Override
    public void deleteEmployeeById(int theId) {
        employeeRepository.deleteById(theId);


    }
}
