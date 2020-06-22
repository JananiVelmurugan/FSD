package com.fsd.day4;

import java.util.Scanner;

import com.fsd.day5.Product;

public class ProductTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the product id");
		long id = scanner.nextLong();
		System.out.println("Enter the product name");
		String productName = scanner.next();
		System.out.println("Enter the supplier name");
		String supplierName = scanner.next();
		
//		Product product = new Product();
//		product.setId(id);
//		product.setProductName(productName);
//		product.setSupplierName(supplierName);
//		
//		System.out.println("Product Id is "+product.getId());
//		System.out.println("Product Name is "+product.getProductName());
//		System.out.println("Supplier Name is "+product.getSupplierName());
		
		Product product = new Product(id,productName,supplierName);
		product.display();
		
		scanner.close();

	}

}
