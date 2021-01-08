package com.telxsi.productservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String id;
	private String name;
	private String desciption;
	private Double price;

	public Product() {}

	public Product(String id, String name, String desciption, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.desciption = desciption;
		this.price = price;
	}
	
	
	public Product(String name, String desciption, Double price) {
	    super();
	    this.name = name;
	    this.desciption = desciption;
	    this.price = price;
	}
	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desciption=" + desciption + ", price=" + price + "]";
	}
		
}
