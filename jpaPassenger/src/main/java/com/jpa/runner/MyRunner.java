package com.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.model.Passenger;
import com.jpa.repository.PassengerRepository;

@Component
public class MyRunner implements CommandLineRunner{
	
	@Autowired
	PassengerRepository passRepo;
	@Override
	public void run(String... args) throws Exception {
		Passenger p=new Passenger();
		p.setPassengerId(102);
		p.setFirstName("Abhi");
		p.setLastName("Java Developer");
		p.setEmail("abhi@gmail.com");
		p.setMobileNo(9999);
		p.setSeatNo(10002);
		
		passRepo.save(p);
		
		
		//fetch data 
		List<Passenger> listPassengers=passRepo.getPassengers("Rahul", "Gandhi");
		
		for(Passenger p1: listPassengers) {
				System.out.println(p1.getEmail());
		}
		
		
	}

}
