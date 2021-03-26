package com.rsupport.onlineprj.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyContoller {

  @GetMapping("/")
  public String index(Model model, Principal principal) {
    return "index";
  }
  
  @RequestMapping(value="/ctiadmin")
  public String ctiadmin() throws Exception {
        return "ctiadmin";
  }
}
