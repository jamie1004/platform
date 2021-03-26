package com.rsupport.onlineprj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private UserDetailsService userDetailsService;
  
  @Bean
  public BCryptPasswordEncoder passwordEncoder() { //password 정
    return new BCryptPasswordEncoder();
  };
  
  
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }
  
  @Override public void configure(WebSecurity web) throws Exception { 
	  web
	  	.ignoring().antMatchers("/css", "/js", "/img","/scss","/map"); 
  }
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .authorizeRequests().antMatchers("/resources/**").permitAll();
//    .and()
//    .formLogin().loginPage("/login").loginProcessingUrl("/loginAction").defaultSuccessUrl("/").permitAll()
//    .and()
//    .logout().logoutSuccessUrl("/login").permitAll()
//    .and()
 
  }
}
