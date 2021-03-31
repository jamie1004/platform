package com.rsupport.onlineprj.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.rsupport.onlineprj.dao.ProductDaoImp;
import com.rsupport.onlineprj.model.Product;

public class ProductService {
	
    @Resource(name="ProductDao")
    private ProductDaoImp m_ProductDao;

    public void save(Product product) {
    	m_ProductDao.save(product);
    }

    @Transactional(readOnly = true)
    public List<Product> list() {
       return m_ProductDao.list();
       
    }

}
