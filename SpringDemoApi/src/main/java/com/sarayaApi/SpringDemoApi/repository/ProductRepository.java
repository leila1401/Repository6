package com.sarayaApi.SpringDemoApi.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarayaApi.SpringDemoApi.domain.Product;

@Repository(value = "productRepository")
@Scope(value = "singleton")
public interface ProductRepository extends JpaRepository<Product , Integer> {

}
