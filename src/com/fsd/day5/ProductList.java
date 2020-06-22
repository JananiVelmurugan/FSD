package com.fsd.day5;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	public static void main(String[] args) {

		Product product1 = new Product(1, "Printer", "HP");
		Product product2 = new Product(2, "Laptop", "Dell");
		Product product3 = new Product(3, "Mobile", "Apple");

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);

		for (Product product : products) {
//			System.out.println(product.getProductName() + " " + product.getSupplierName());
//			System.out.println(product);
		}

	}

}
