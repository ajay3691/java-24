package com.product.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService prodService;
	
	@GetMapping("/products")
	public List<Product> getProduct(){
		return prodService.getProducts();
	}
	
	/*
	 URL: localhost:8080/api/add
	 Method Type:POST
	 Required Fields: name, price,qty, info
	 */
	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		prodService.addProduct(product);
	}
	
	/*
	 URL:localhost:8080/api/product/{id}
	 Method:PUT
	 Required Fields: name, price, qty,info
	 Access Type:public
	 	 	
	 */
	@PutMapping("/product/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable Integer id){
		try {
			prodService.updateProduct(product,id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
