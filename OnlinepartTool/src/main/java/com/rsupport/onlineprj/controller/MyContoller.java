package com.rsupport.onlineprj.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsupport.onlineprj.service.ProductService;



@Controller
public class MyContoller {  
	
  @GetMapping(value="/")
  public String login() throws Exception {
        return "login";
  }
  
  @RequestMapping(value="/ctiadmin")
  public String ctiadmin() throws Exception {
        return "ctiadmin";
  }
  
  @RequestMapping(value="/navbar")
  public String navbar() throws Exception {
        return "navbar";
  }
  
}
