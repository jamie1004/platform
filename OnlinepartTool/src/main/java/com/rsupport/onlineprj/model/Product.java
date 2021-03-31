package com.rsupport.onlineprj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product {
	
	  @Id
	  @Column(name = "idx")
	  private int m_iIdx;
	  
	  @ManyToOne
	  @Column(name = "productname")
	  private String m_sProductname;
	  
	  private List<Product> m_productList;

	  public String getProductname() {
		    return m_sProductname;
	  }
	  
	  public List<Product> getProductList() {
		return m_productList;
	  }
	  
	  public void setProductList(List<Product> Product) {
		this.m_productList = Product;
	  }
	  

	 
}
