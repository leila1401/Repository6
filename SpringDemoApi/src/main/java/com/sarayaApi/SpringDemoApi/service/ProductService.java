package com.sarayaApi.SpringDemoApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarayaApi.SpringDemoApi.domain.Product;
import com.sarayaApi.SpringDemoApi.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		
		return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return repo.save(product) ;
	}

	@Override
	public void deleteProduct(Integer id) {
        repo.deleteById(id);		
	}

	@Override
	public Product getProductById(Integer id) {

		return repo.findById(id).get() ;
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll() ;
	}

}
