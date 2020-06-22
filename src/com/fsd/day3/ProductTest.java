package com.fsd.day3;

public class ProductTest {
	public static void main(String[] args) {
		Product product = new Product();
		System.out.println(product.getId());
		product.setId(10);
		System.out.println(product.getId());

		System.out.println(product.getName());
		product.setName("Laptop");
		System.out.println(product.getName());
	}

}
