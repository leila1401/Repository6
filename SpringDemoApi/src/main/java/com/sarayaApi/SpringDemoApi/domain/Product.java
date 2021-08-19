package com.sarayaApi.SpringDemoApi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Product_Details")
public class Product {
	@Id
	@Column(name = "Product_Id")
	@GeneratedValue
	private Integer Id;
	@Column(name = "Product_name")
	private String name;
	@Column(name ="Product_price")
	private String price;
	@Column(name ="Product_color")
	private String color;
	
	public Product() {
		super();
	}

	public Product(Integer id, String name, String price, String color) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
	
	
	

}
