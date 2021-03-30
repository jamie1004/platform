package com.rsupport.onlineprj.dao;

import com.rsupport.onlineprj.model.User;

//data access object interface 정의

public interface UserDetailsDao {
  User findUserByUsername(String username);
  public UserDetailsDao getUserById(String username);
}
