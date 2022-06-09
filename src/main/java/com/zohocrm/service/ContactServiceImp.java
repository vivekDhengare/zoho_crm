package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Reporitories.ContactReporitories;
import com.zohocrm.entity.Contact;
@Service
public class ContactServiceImp implements ContactService {
	@Autowired
	ContactReporitories contactRepo;

	@Override
	public void saveContact(Contact contact) {
		try {
			contactRepo.save(contact);
			} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}

	@Override
	public Contact getById(long id) {
	 Optional<Contact> findById = contactRepo.findById(id);
	 Contact contact= findById.get();
		
		return contact;
	}
	

		
		
	}


