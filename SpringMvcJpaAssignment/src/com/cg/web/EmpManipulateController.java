package com.cg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entity.Emp;
import com.cg.service.IEmpDao;

@Controller
@EnableTransactionManagement
public class EmpManipulateController {

	@Autowired
	private IEmpDao dao;
	
	@RequestMapping("/showaddform")
	public String showAddForm(Model model) {
		model.addAttribute("dlist",dao.viewDepts());
		return "AddEmpPage";
	}
	
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute("emodel")Emp emp,Model model) {
		try {
			dao.addEmp(emp);
			model.addAttribute("msg","Employee Added");
			return "HomePage";
		}catch(Exception e) {
			System.out.println("message" + e.getMessage());
			model.addAttribute("dlist",dao.viewDepts());
			model.addAttribute("msg","ID already exists");
		    return "AddEmpPage";
	}
	
}
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("txteid") Integer eid, @RequestParam("dname") String dept, Model model) {
		dao.deleteEmp(eid);
		if(dept.isEmpty())
			return "redirect:viewall";
		else
			return "redirect:viewbydept?txtdept="+dept;
	}
	
	@RequestMapping("/edit")
	public String editEmployee(@RequestParam("txteid")int eid, @RequestParam("dname")String dept,Model model) {
		model.addAttribute("emodel",dao.viewEmp(eid));
		return "EditFormPage";
	}
	@RequestMapping("/update")
	public String updateEmployee(@ModelAttribute("emodel")Emp emp,@RequestParam("txtdept")String dept,Model model) {
		dao.editEmp(emp);
		if(dept.isEmpty())
			return "redirect:viewall";
		else
			return "redirect:viewbydept?txtdept="+dept;
		
		

	}
}
