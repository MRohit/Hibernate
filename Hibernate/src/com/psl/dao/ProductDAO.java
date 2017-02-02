package com.psl.dao;

import com.psl.beans.Employee;
import com.psl.beans.Product;

public interface ProductDAO {
	void saveProduct(Product product);
	
	//Read
	Product getProductById(int id);
	
	//Update
	void updateProduct(Product product);
	
	//Delete
	void deleteProduct(Product product);
}
