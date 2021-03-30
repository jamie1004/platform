package com.rsupport.onlineprj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES")
public class Authorities {
  @Id
  @Column(name = "AUTHORITY")
  private String m_sAuthority;

  @ManyToOne
  @JoinColumn(name = "USERNAME")
  private User m_user;

  public String getAuthority() {
    return m_sAuthority;
  }

  public void setAuthority(String authority) {
    this.m_sAuthority = authority;
  }

  public User getUser() {
    return m_user;
  }

  public void setUser(User user) {
    this.m_user = user;
  }

}
