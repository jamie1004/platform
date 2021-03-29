package com.rsupport.onlineprj.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsupport.onlineprj.model.User;

//data access object를 실제 구현


@Repository
public class UserDetailsDaoImp implements UserDetailsDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public User findUserByUsername(String username) {
    return sessionFactory.getCurrentSession().get(User.class, username);
  }

	@Override
	public UserDetailsDao getUserById(String username) {
		// TODO Auto-generated method stub
		return null;
	}
  

}
