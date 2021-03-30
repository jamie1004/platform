package com.rsupport.onlineprj.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
  @Id
  @Column(name = "USERNAME")
  private String m_sUsername;

  @Column(name = "PASSWORD", nullable = false)
  private String m_sPassword;

  @Column(name = "ENABLED", nullable = false)
  private boolean m_bEnabled;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "m_user")
  private Set<Authorities> m_authorities = new HashSet<>();

  public String getUsername() {
    return m_sUsername;
  }

  public void setUsername(String username) {
    this.m_sUsername = username;
  }

  public String getPassword() {
    return m_sPassword;
  }

  public void setPassword(String password) {
    this.m_sPassword = password;
  }

  public boolean isEnabled() {
    return m_bEnabled;
  }

  public void setEnabled(boolean enabled) {
    this.m_bEnabled = enabled;
  }

  public Set<Authorities> getAuthorities() {
    return m_authorities;
  }

  public void setAuthorities(Set<Authorities> authorities) {
    this.m_authorities = authorities;
  }
}
