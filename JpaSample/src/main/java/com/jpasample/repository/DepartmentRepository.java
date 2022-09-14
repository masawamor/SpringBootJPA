package com.jpasample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpasample.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
