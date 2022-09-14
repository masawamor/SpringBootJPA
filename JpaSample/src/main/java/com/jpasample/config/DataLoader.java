package com.jpasample.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jpasample.model.Comment;
import com.jpasample.model.Department;
import com.jpasample.model.Employee;
import com.jpasample.repository.CommentRepository;
import com.jpasample.repository.DepartmentRepository;
import com.jpasample.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

	private final CommentRepository repository;
	
	private final EmployeeRepository employeeRepository;
	
	private final DepartmentRepository departmentRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		var comment = new Comment();
		comment.setComment("こんにちは");
		repository.save(comment);
		
		var testComment = new Comment();
		testComment.setComment("テストコメント");
		repository.save(testComment);
		
		// ----------------------------------------------
		
		var department = new Department();
		department.setName("Department1");
		departmentRepository.save(department);
		
		var employee = new Employee();
		employee.setName("Masawa Morishita");
		employee.setDepartment(department);
		employeeRepository.save(employee);

		var testEmployee = new Employee();
		testEmployee.setName("Aoki Takeshi");
		testEmployee.setDepartment(department);
		employeeRepository.save(testEmployee);
	}
	
}
