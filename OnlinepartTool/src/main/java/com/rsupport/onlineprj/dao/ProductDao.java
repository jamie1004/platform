package com.rsupport.onlineprj.dao;

import java.util.List;

import com.rsupport.onlineprj.model.Product;

public interface ProductDao {	

	void save(Product product);
	List<Product> list();

}
