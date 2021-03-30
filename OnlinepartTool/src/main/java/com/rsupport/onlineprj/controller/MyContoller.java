package com.rsupport.onlineprj.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyContoller {
	
  private List<String> createQuestion() {
	  String q1 = new String("당신의 역할은?");
	  String q2 = new String("사용하는 개발도구는?");
	  String q3 = new String("하고 싶은 말은?");
      return Arrays.asList(q1, q2, q3);
    }	

  @GetMapping("/index")
  public String index(Model model, Principal principal) {
	
	List<String> questions = createQuestion();
    model.addAttribute("questions", questions);
    return "index";
  }
  
  @RequestMapping(value="/")
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
