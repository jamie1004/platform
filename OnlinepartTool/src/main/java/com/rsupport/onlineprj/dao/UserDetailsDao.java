package com.rsupport.onlineprj.dao;

import java.util.List;

import com.rsupport.onlineprj.model.Product;
import com.rsupport.onlineprj.model.User;

//data access object interface 정의

public interface UserDetailsDao {
  User findUserByUsername(String username);
  List getProductName();
  
  public UserDetailsDao getUserById(String username);
}
