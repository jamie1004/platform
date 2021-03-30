package com.rsupport.onlineprj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cticategory")
public class Cticategory {

  @Id
  @Column(name = "idx")
  private int m_iIdx;

  @ManyToOne
  @Column(name = "product")
  private int m_iProduct;
  
  @ManyToOne
  @Column(name = "productname")
  private String m_sProductname;
  
  @ManyToOne
  @Column(name = "category1")
  private int m_iCategory1;
  
  @ManyToOne
  @Column(name = "categoryname1")
  private String m_sCategoryname1;
  
  @ManyToOne
  @Column(name = "category2")
  private int m_iCategory2;
  
  @ManyToOne
  @Column(name = "categoryname2")
  private String m_sCategoryname2;
//  

}
