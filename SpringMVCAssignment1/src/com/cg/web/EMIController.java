package com.cg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EMIController {

  @RequestMapping("home.htm")
  public String displayHome() {
	   
	  return "Home";
  }
  
  @GetMapping("emifrm.htm")
  public String displayEmiForm() {
	  
	  return "EMIform";
  }
  
  @GetMapping("calcemi.htm")
  public String displayEMI(@RequestParam("txtamt")double amount,@RequestParam("txtyears")int years,Model model) {
	  
	  double ci = amount * Math.pow((1+0.1), years);
	  double emi = ci/(years*12);
	  model.addAttribute("Totalamt", ci);
	  model.addAttribute("monthlyamt",emi);
	  return "CalculatedEMI";
  }
}
