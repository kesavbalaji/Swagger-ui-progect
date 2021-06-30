package com.training.controller;

import com.training.model.Employee;
import com.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

import static com.training.specifications.UserSpecifications.*;
import static org.springframework.data.jpa.domain.Specification.where;

@RestController
//@RequestMapping("/add")
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/getEmployee")
    public List<Employee> getEmployee() {

        List<Employee> list = employeeRepository.findAll();
        System.out.println("Getting data from DB" + list);
        return list;
    }

    @GetMapping("/employee/{firstname}/{department}")
    public List<Employee> findByFirstNameAndDepartment (@PathVariable("firstname") String firstname, @PathVariable("department")
                                                        String department){

        return employeeRepository.findAll(where(hasFirstName(firstname).and(hasDepartment(department))));
    }

    @GetMapping("/employee/{lastname}")
    public List<Employee> hasLastName(@PathVariable("lastname") String lastname) {
        return employeeRepository.findAll(containsLastName(lastname));

    }

    @RequestMapping("/user")
    public Principal user(Principal principal){
        return principal;
    }

    @GetMapping("/helloWorld")
    public String message() {
        return "helloWorld";
    }



}
