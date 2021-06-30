package com.training.demo;

import com.training.model.Employee;
import com.training.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

    @MockBean
    private EmployeeRepository employeeRepository;


    @Test
    public void getEmployeeTest() {
        when(employeeRepository.findAll()).thenReturn(Stream
                .of(new Employee(1, "Kesav", "Balajee", "EEE"),
                        new Employee(2, "Arun", "Vijay", "CSC")).collect(Collectors.toList()));
        Assert.assertEquals(2,employeeRepository.findAll().size());
    }


}
