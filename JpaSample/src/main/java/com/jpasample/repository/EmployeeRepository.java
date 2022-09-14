package com.jpasample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpasample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
