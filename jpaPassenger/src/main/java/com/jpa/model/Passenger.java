package com.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private Integer passengerId;
	@Column(length=15)
	private String  firstName;
	@Column(length=15)
	private String  lastName;
	@Column(length=15)
	private String  email;
	private Integer seatNo;
	private Integer MobileNo;
	
	//generate setter & getters
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}
	public Integer getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		MobileNo = mobileNo;
	}
	
}
