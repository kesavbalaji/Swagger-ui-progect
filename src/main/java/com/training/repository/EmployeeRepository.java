package com.training.repository;

import com.training.model.Employee;
import com.training.specifications.UserSpecifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>, JpaSpecificationExecutor<Employee> {
}
