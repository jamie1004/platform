package com.rsupport.onlineprj.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
 
import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsupport.onlineprj.dao.ProductDao;
import com.rsupport.onlineprj.dao.ProductDaoImp;
import com.rsupport.onlineprj.model.Product;
import com.rsupport.onlineprj.service.ProductService;


  
@Controller
public class DatabaseController{     
     
//    private ProductService m_proService;
//     
//    /**
//     * Simply selects the home view to render by returning its name.
//     */
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String index(Locale locale, Model model) throws Exception{
//        model.addAttribute("productList", m_proService.list());
// 
//        return "index";
//    }
//  
	private ProductDao m_proDao;
    private ProductService m_proService;
    
    @GetMapping(value="/index")
    public String index(Model model, Principal principal) {
    	
    	
    	List<String> list =  new ArrayList<>();
    	list.add("RV");
    	list.add("RM");
    	list.add("RC");
    	
    	model.addAttribute("productList", list);
  	
      return "index";
    }    

}
 