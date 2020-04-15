package com.cg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entity.Emp;

@Controller
public class SalaryController {

	@GetMapping("salform.htm")
	public String DisplaySalForm() {

		return "SalaryForm";
	}

	@RequestMapping("calcsal.htm")
	public String dispaySalary(@RequestParam("eid") int eid, @RequestParam("ename") String name,
			@RequestParam("esal") double sal, Model model) {
		
		Emp emp = new Emp(eid, name, sal);
		double pf = emp.getSal() * 0.12;
		double al = emp.getSal() * 0.4;
		double net = emp.getSal() + al - pf;
		model.addAttribute("employee", emp);
		model.addAttribute("pf", pf);
		model.addAttribute("allowances", al);
		model.addAttribute("netsal", net);
		return "CalculatedSalary";

	}
}
