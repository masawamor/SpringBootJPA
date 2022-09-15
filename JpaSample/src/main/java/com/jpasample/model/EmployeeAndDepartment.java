package com.jpasample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeAndDepartment {

	@Id
	private Long empId;
	
	private String empName;
	
	private Long empDepartmentId;
	
	private Long depDepartmentId;
	
	private String depName;
	
}
