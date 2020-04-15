package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.cg.dao.IEmpDao;

@Controller
public class EmpController {

	@Autowired
	private IEmpDao dao;
	
	@RequestMapping("/viewall")
	public String viewAll(Model model) {
		model.addAttribute("elist",dao.viewEmp());
		return "EmpviewPage";
	}
	
	@RequestMapping("/viewbyid")
	public String viewById() {
		return "ViewIdPage";
	}
	
	@RequestMapping("/searchbyid")
	public String searchById(@RequestParam("txteid")int eid ,Model model) {
		model.addAttribute("emodel",dao.viewEmp(eid));
		return "ViewIdPage";
	}
	@RequestMapping("/viewbydept")
	public String viewByDept(Model model) {
		model.addAttribute("dlist",dao.viewDepts());
		return "ViewDeptPage";
	}
	@RequestMapping("/searchbydept")
	public String searchByDept(@RequestParam("txtdept")String dept,Model model) {
		
		model.addAttribute("elist",dao.viewEmp(dept));
		return "EmpviewPage";
	}
}
