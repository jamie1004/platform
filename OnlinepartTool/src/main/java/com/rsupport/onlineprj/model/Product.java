package com.rsupport.onlineprj.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.SessionFactory;

@Entity
@Table(name = "product")

public class Product {
	  
	  @Id
	  @Column(name = "idx")
	  private int m_iIdx;
  
	  @ManyToOne
	  @Column(name = "productname")
	  private String m_sProductname;
	  
	  public String getProductname() {
		    return m_sProductname;
	  }
	 
}
