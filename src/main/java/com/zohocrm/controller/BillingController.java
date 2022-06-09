package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Billing;
import com.zohocrm.service.BillingService;

@Controller
public class BillingController {
	@Autowired
	BillingService billingSer;
	@RequestMapping("/generate")
	   private String generateOneBill(@ModelAttribute("bill")Billing bill,ModelMap Model) {
		billingSer.generateOneBill(bill);
		
		return "billing_result";

}
	
}
