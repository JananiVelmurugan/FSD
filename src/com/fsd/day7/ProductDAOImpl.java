package com.fsd.day7;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

	static List<Product> products;

	public ProductDAOImpl() {
		products = new ArrayList<Product>();
	}

	@Override
	public void insert(Product product) {
		products.add(product);
	}

	@Override
	public Product view(int id) {
		for (Product product : products) {
			if (id == product.getId()) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> viewAll() {
		return products;
	}

}
