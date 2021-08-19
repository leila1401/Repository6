package com.sarayaApi.SpringDemoApi.service;

import java.util.List;

import com.sarayaApi.SpringDemoApi.domain.Product;

public interface IProductService {
	
	Product addProduct(Product product);
	Product updateProduct(Product product);
	void deleteProduct(Integer id);
	Product getProductById(Integer id);
	List <Product> getAllProducts();
	
	

}
