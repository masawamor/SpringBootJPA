package com.jpasample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpasample.model.Employee;
import com.jpasample.model.EmployeeAndDepartment;
import com.jpasample.repository.EmployeeRepository;
import com.jpasample.repository.EmproyeeAndDepartmentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmployeeContoroller {

	private final EmployeeRepository repository;
	private final EmproyeeAndDepartmentRepository allValueRepository;

	@GetMapping("/employee/show")
	public List<Employee> showList() {
		List<Employee> list = repository.findAll();
		return list;
	}
	
	@PostMapping("/employee/add")
	public List<Employee> add(@ModelAttribute Employee employee) {
		repository.save(employee);
		List<Employee> list =  repository.findAll();
		return list;
	}
	
	@GetMapping("/employee/allvalue/{empId}")
	public EmployeeAndDepartment getAllValue(@PathVariable Long empId) {
		var entity = allValueRepository.getAllValue(empId);
		return entity;
	}
}
