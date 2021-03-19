package com.rsupport.onlineprj.dao;

import com.rsupport.onlineprj.model.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
