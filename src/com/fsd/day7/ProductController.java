package com.fsd.day7;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	static private ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i != 2) {
			System.out.println("Enter\n1 - insert\n2 - display  single product\n3 - display all");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Inserting Products");
//				Product product1 = new Product(1, "Mobile");
//				Product product2 = new Product(2, "Television");
//				productServiceImpl.add(product1);
//				productServiceImpl.add(product2);
				System.out.println("Enter the number of products");
				int total = scanner.nextInt();
				for (int j = 0; j < total; j++) {
					System.out.println("Please enter prodcut id and name");
					int id = scanner.nextInt();
					String name = scanner.next();
					Product newProduct = new Product(id, name);
					productServiceImpl.add(newProduct);
				}
				break;
			case 2:
				System.out.println("Viewing Product By Id");
				Product product = productServiceImpl.display(4);
				if (product == null) {
					System.out.println("Sorry no products found with the id!!");
				} else {
					System.out.println(product);
				}
				break;
			case 3:

				List<Product> products = productServiceImpl.displayAll();
				if (products.size() == 0) {
					System.out.println("No products to display");
				} else {
					System.out.println("Viewing All Products");
					for (Product p : products) {
						System.out.println(p);
					}
				}

				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			i++;
		}
		scanner.close();
	}
}
