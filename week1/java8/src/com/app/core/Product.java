package com.app.core;

public class Product {

	private int id;
	private String name;
	private Category cat;
	private float price;
	
	public Product() {
		super();
	}
	
	public Product(int id, String name, Category cat, float price) {
		super();
		this.id = id;
		this.name = name;
		this.cat = cat;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cat=" + cat + ", price=" + price + "]";
	}
	
	
	
	

	
	
	
	
	
}
