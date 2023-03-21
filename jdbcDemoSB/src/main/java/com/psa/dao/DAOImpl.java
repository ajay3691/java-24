package com.psa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DAOImpl implements DAOInterface {
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void insertRecords() {
		String inst= "insert into emp7 values(102,'sonia')";
		jt.update(inst);
	}

	@Override
	public List selectData() {
		List l = jt.queryForList("select * from emp7");
		return l;
	}

}
