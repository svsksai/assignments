package com.cg.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entity.Student;

@Controller
public class StudentController {

	@RequestMapping("studentform.htm")
	public String displayStudentForm(Model model) 
	{
		model.addAttribute("smodel",new Student());
		return "StudentForm";
	}
	
	@PostMapping("stusubmit.htm")
	public String displayStudentScore(@Valid @ModelAttribute("smodel")Student stu,BindingResult br,Model model) {
		if(br.hasErrors())
			return "StudentForm";
		
		int tot = stu.getJavaMarks() + stu.getAngMarks() + stu.getSpringMarks();
		double avg = Math.round(tot/3.0 * 100)/100.0;
		model.addAttribute("total",tot);
		model.addAttribute("average",avg);
		if(stu.getJavaMarks()>=60 && stu.getAngMarks()>=60 && stu.getSpringMarks()>=60)
			model.addAttribute("result","pass");
		else
			model.addAttribute("result","fail");
		return "StudentScore";
		
		
		
	}
}
