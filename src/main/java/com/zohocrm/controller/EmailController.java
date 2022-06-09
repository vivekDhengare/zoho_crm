package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utlity.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailSer;
	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("emailId") String emailid, ModelMap model) {
		model.addAttribute("email", emailid);
		
		return "composeEmail";
		
	}
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to")String to,@RequestParam("subject") String subject,@RequestParam("body")String body ) {
		emailSer.sendMassge(to, subject, body);
		return"composeEmail";

}
}
