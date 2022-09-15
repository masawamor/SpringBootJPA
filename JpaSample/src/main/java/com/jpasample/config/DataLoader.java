package com.jpasample.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jpasample.model.Department;
import com.jpasample.model.Employee;
import com.jpasample.repository.DepartmentRepository;
import com.jpasample.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {
	
	private final DepartmentRepository departmentRepository;
	private final EmployeeRepository   employeeRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		var department = new Department();
		department.setName("Department1");
		departmentRepository.save(department);
		
		var employee1 = new Employee();
		employee1.setName("Masawa Morishita");
		employee1.setDepartment(department);
		employeeRepository.save(employee1);

		var employee2 = new Employee();
		employee2.setName("Aoki Takeshi");
		employee2.setDepartment(department);
		employeeRepository.save(employee2);
	}
	
}
