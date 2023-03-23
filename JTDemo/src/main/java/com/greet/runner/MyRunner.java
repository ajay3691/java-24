package com.greet.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greet.dao.EmployeeImp;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    EmployeeImp  e;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("inside runner class");
		e.insertRecords();
		List data= e.selectRecords();
		data.forEach(map->System.out.println(map));
	}

}
