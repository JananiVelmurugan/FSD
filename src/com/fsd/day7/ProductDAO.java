package com.fsd.day7;

import java.util.List;

public interface ProductDAO {
	
	void insert(Product product) ;
	
	Product view(int id);

	List<Product> viewAll();
	

}
