package com.jpasample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpasample.model.EmployeeAndDepartment;

@Repository
public interface EmproyeeAndDepartmentRepository extends JpaRepository<EmployeeAndDepartment, Long> {

	@Query(value="SELECT "
			+ "  emp.id AS emp_id "
			+ ", emp.name AS emp_name "
			+ ", emp.department_id AS emp_department_id "
			+ ", dep.id AS dep_department_id "
			+ ", dep.name AS dep_name "
			+ "FROM "
			+ "EMPLOYEE emp "
			+ "JOIN "
			+ "DEPARTMENT dep "
			+ "ON "
			+ "emp.department_id = dep.id "
			+ "WHERE "
			+ "emp.id = ?1"
			, nativeQuery = true)
	EmployeeAndDepartment getAllValue(Long empId);
}
