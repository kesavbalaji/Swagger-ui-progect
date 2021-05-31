package com.training.controller;

import com.training.model.Employee;
import com.training.repository.EmployeeRepository;
import com.training.specifications.UserSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.Specification.*;
import static com.training.specifications.UserSpecifications.*;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/add")
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {

        return employeeRepository.save(employee);
    }

    @GetMapping("/")
    public List<Employee> getEmployee() {

        return (List<Employee>) employeeRepository.findAll();
    }

    @GetMapping("/employee/{firstname}/{department}")
    public List<Employee> findByFirstNameAndDepartment (@PathVariable("firstname") String firstname, @PathVariable("department")
                                                        String department){

        return employeeRepository.findAll(where(hasFirstName(firstname).and(hasDepartment(department))));
    }

    @GetMapping("/employee/{lastname}")
    public List<Employee> hasLastName(@PathVariable ("lastname") String lastname){

        System.out.println(lastname);

        return employeeRepository.findAll(containsLastName(lastname));
    }



}
