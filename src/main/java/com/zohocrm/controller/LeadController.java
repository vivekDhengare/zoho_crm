package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	LeadService leadSer;
	@Autowired
	ContactService contactSer;
	@RequestMapping("/createLead")
	public String viewCreateLead() {
		return "createLead";

}
	@RequestMapping("/saveCreatLead")
	public String saveCreatLead(@ModelAttribute("Lead") Lead lead, ModelMap model) {
		leadSer.saveLead(lead);
		model.addAttribute("lead", lead);
		return "Lead_Info";
		
	}
	@RequestMapping("/listLead")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadSer.findAllLeads();
		model.addAttribute("lead",  leads);
		return "listLead";
}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id")long id, ModelMap Model) {
		Lead lead =leadSer.getById(id);
		Model.addAttribute("lead", lead);
		return "Lead_Info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id, ModelMap Model) {
		Lead lead =leadSer.getById(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setLeadSource(lead.getLeadSource());
		contactSer.saveContact(contact);
	 
		leadSer.deleteLead(id);
		
	List<Contact> contacts = contactSer.findAllContacts();
	Model.addAttribute("contact", contacts);
		
		return "contact_result";
	}
}