package com.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	
	@Id
	private Integer id;
	
	private String prodName;
	private double prodCost;
	private String prodColor;
	
	/*generate setter and getter,constuctors and toString metho debugging*/
	
	public Product() {
		super();
	}
	
	
	public Product(Integer id) {
		super();
		this.id = id;
	}


	
	public Product(Integer id, String prodName, double prodCost, String prodColor) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodColor = prodColor;
	}


	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdColor() {
		return prodColor;
	}
	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	
	
}
