package com.fsd.day5;

public class Product {

	private long id;
	private String productName;
	private String supplierName;

	// default constructor
	public Product() {
		System.out.println("I am a default product constructor");
	}

	// arg constructor
	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public void display() {
		System.out.println("Product Id is " + getId());
		System.out.println("Product Name is " + getProductName());
		System.out.println("Supplier Name is " + getSupplierName());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", supplierName=" + supplierName + "]";
	}
	
	
}
