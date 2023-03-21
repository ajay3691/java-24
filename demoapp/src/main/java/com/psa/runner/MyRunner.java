package com.psa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.psa.beans.HelloBean;


public class MyRunner implements CommandLineRunner{
	
	@Autowired
	HelloBean helloBean;
	
	@Override
	public void run(String... args) throws Exception {
		helloBean.sayHello();
		
	}

}
