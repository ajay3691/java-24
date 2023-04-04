package com.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer empId;
	private String empFirstName;
	private String empLastName;
	private String empEmailId;
	private String empLoc;
	private double empSal;
	public Employee() {
		super();
	}
	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}
	public Employee(String empFirstName, String empLastName, String empEmailId, String empLoc, double empSal) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailId = empEmailId;
		this.empLoc = empLoc;
		this.empSal = empSal;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmailId=" + empEmailId + ", empLoc=" + empLoc + ", empSal=" + empSal + "]";
	}
	
	
	
}
