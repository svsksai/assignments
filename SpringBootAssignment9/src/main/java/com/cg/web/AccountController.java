package com.cg.web;

import javax.validation.Valid;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entity.Account;
import com.cg.entity.TransferBean;
import com.cg.exception.AccountException;
import com.cg.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService service;
	
	@RequestMapping("/viewall")
	public String viewAllAccount(Model model) {
		model.addAttribute("alist",service.viewAccount());
		return "AccountViewPage";
	}
	@GetMapping("/showaddform")
	public String displayAddPage(Model model) {
     model.addAttribute("abean",new Account());
		return "AddAccountPage"; 
	}
	
	@PostMapping("/add")
	public String addAccount(@Valid @ModelAttribute("abean")Account account,BindingResult br , Model model) {
		if(br.hasErrors())
			return "AddAccountPage";
		try {
			service.addAccount(account);
			model.addAttribute("msg","Account added Successfully");
			return "HomePage";
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
			model.addAttribute("msg","ID already Exists");
			return "AddAccountPage";
		}
	}
	
	@GetMapping("/showtransfer")
	public String displayShowTransfer(Model model) {
		model.addAttribute("tbean",new TransferBean());
		return "TransferPage";
	}
	
	@PostMapping("/submittransfer")
	public String processTransferFund(@Valid @ModelAttribute("tbean")TransferBean tbean, BindingResult br, Model model) {
		if(br.hasErrors())
			return "TransferPage";
		try {
			service.transferFund(tbean.getFromAccountId(),tbean.getToAccountId(),tbean.getAmt());
			model.addAttribute("msg","Successfully Transfered");
			return "HomePage";
		}catch(AccountException ex) {
			model.addAttribute("msg",ex.getMessage());
			return "TransferPage";
		}
	}
	@RequestMapping("/delete")
	public String deleteAccount( @RequestParam("txtaid")int aid,Model model){
		service.deleteAccount(aid);
		model.addAttribute("msg","Successfully Deleted");
		return "redirect:viewall";
		

}
}
