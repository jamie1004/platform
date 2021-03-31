package com.rsupport.onlineprj.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsupport.onlineprj.model.Product;


public class ProductDaoImp implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void save(Product product) {
	      sessionFactory.getCurrentSession().save(product);
	}
	
	@Override
	public List<Product> list() {
	   
      @SuppressWarnings("unchecked")
      TypedQuery<Product> query = sessionFactory.getCurrentSession().createQuery("from product");
      return query.getResultList();
   }

}
