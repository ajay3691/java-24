package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer	> {
	//select * from employee_tab where emp_loc =""
	List<Employee>  findByEmpLoc(String loc);
}
