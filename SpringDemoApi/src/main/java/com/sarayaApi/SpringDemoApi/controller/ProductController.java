package com.sarayaApi.SpringDemoApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sarayaApi.SpringDemoApi.domain.Product;
import com.sarayaApi.SpringDemoApi.service.IProductService;

@RestController

public class ProductController {
	@Autowired
	@Qualifier("productService")
	IProductService productService;
	
	@GetMapping(value="/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping(value = "/product/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return productService.getProductById(id);
	}
	
	@PostMapping(value="/products")
	@ResponseStatus(code= HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	 
	@DeleteMapping(value="/products/{id}")
	@ResponseStatus(code= HttpStatus.NO_CONTENT)
	public void deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
	}


}
