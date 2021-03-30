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
  public BCryptPasswordEncoder passwordEncoder() { //password �젙
    return new BCryptPasswordEncoder();
  };  
  
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }
  
  @Override public void configure(WebSecurity web) throws Exception { 
	  web
	  	.ignoring().antMatchers("/resources/**","css/**", "/js/**", "/img/**","/scss/**","/map/**"); 
  }
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .authorizeRequests().antMatchers("/resources/**","/js/**").permitAll()
    .and()
    .authorizeRequests().antMatchers("/login**").permitAll() // 보호된 리소스 uri 접근할 수 있는 권한을 설정 
    .and()
    .authorizeRequests().antMatchers("/logout/**").permitAll() // 보호된 리소스 uri 접근할 수 있는 권한을 설정 
    .and()
    .formLogin().loginPage("/login").loginProcessingUrl("/loginAction").defaultSuccessUrl("/index").permitAll()
    .and()
    .logout().logoutSuccessUrl("/login").permitAll()
    .and()
    .csrf().disable();
    
    
  }
}
