package com.psa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.dao.DAOImpl;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	DAOImpl di;
	@Override
	public void run(String... args) throws Exception {
		di.insertRecords();
		List list = di.selectData();
		list.forEach(x ->System.out.println(x));
	}

}
