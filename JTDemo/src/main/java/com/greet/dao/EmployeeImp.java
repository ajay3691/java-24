package com.greet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImp {
	
	@Autowired
	JdbcTemplate jt;
	public void insertRecords() {
		System.out.println("Inserting Records");
		jt.update("insert into emp7 values(105,'kiran')");
	}
	
	public List selectRecords() {
		System.out.println("getting Data");
		List data=jt.queryForList("select * from emp7");
		return data;
	}
}
