package com.fsd.day7;

import java.util.List;

public class ProductServiceImpl {

	private ProductDAO productDAO;

	public ProductServiceImpl() {
		productDAO = new ProductDAOImpl();
	}

	public void add(Product product) {
		productDAO.insert(product);
	}

	public Product display(int id) {
		return productDAO.view(id);
	}

	public List<Product> displayAll() {
		return productDAO.viewAll();
	}

}
