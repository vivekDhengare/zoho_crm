package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	ContactService contactSer;
	
	@RequestMapping("/listAllContact")
public  String listAllContact(ModelMap Model) {
List<Contact> contacts = contactSer.findAllContacts();
Model.addAttribute("contact", contacts);
return "contact_result";
	}
	@RequestMapping("/getContactById")
	public String getById(@RequestParam("id") long id,ModelMap Model) {
		Contact contact = contactSer.getById(id);
		Model.addAttribute("contact", contact);
		return "Genrate_Bill";
	}
}
