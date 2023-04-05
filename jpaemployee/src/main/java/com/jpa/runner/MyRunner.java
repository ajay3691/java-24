package com.jpa.runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Employee;
import com.jpa.repository.EmployeeRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository empRepo;
	@Override
	public void run(String... args) throws Exception {
		/*** Insert Operation **/
		//empRepo.save(new Employee("Rahul","Gandhi","rahul@gmail.com","Bangalore", 45000.00));
		//empRepo.save(new Employee("Sonia","Gandhi","soia@gmail.com","New Delhi", 45000.00));
		//empRepo.save(new Employee("Priyanka","Gandhi","priya@gmail.com","Bangalore", 45000.00));
		/** fetch data based on condition*/
		//empRepo.findByEmpLoc("Bangalore").forEach(System.out::println);
		
		//List<Employee> empList=empRepo.findByEmpLoc("Bangalore");
		//empRepo.findByEmpLoc("Bangalore").forEach(emp->System.out.println(emp.getEmpFirstName()));
		/*
		Iterator itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		*/
		empRepo.getEmployees("Rahul", "Gandhi").forEach(emp-> System.out.println(emp.getEmpId()));
	}

}
