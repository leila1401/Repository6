package com.sarayaApi.SpringDemoApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sarayaApi.SpringDemoApi.domain.Product;
import com.sarayaApi.SpringDemoApi.repository.ProductRepository;

@SpringBootApplication
public class SpringDemoApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApiApplication.class, args);
	}
	
	@Autowired
	ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(null , "Diagne" , "123459" , "red"));
		repo.save(new Product(null , "Soumare" , "123158" , "Green"));
		repo.save(new Product(null , "Cissokho" , "123457" , "yellow"));
		repo.save(new Product(null , "Sidibe" , "123456" , "blue"));
		repo.save(new Product(null , "Danfakha" , "123545" , "grey"));
		repo.save(new Product(null , "Keita" , "123445" , "greenYellow"));

		
		
		

		
	}

}
