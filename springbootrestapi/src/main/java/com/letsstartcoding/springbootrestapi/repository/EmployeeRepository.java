package com.letsstartcoding.springbootrestapi.repository;

import com.letsstartcoding.springbootrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{

}
