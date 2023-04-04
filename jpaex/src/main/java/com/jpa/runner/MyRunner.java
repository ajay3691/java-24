package com.jpa.runner;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Product;
import com.jpa.repository.ProductRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	
	@Autowired
	ProductRepository  prodRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*** Insert Data Into Table **/
		
		//prodRepo.save(new Product("Samsung", 45000.00,"Blue"));
		//prodRepo.save(new Product("Iphone", 55000.00,"Red"));
		//prodRepo.save(new Product("Mi", 65000.00,"Gray"));
	    /*** Read Operation */
		/*
		List<Product> productList = prodRepo.findAll();
		//productList.forEach(x-> System.out.println(x));
		Iterator itr= productList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		//prodRepo.findAll().forEach(product -> System.out.println(product));
		*/
		/*** Delete Operation */
		prodRepo.deleteAll();
		//prodRepo.deleteAllById(null);
	}

}
