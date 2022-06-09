package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Reporitories.LeadReporitories;
import com.zohocrm.entity.Lead;
@Service
public class LeadServiceImp implements LeadService {
	@Autowired
	LeadReporitories leadRepo;

	@Override
	public void saveLead(Lead lead) {
		try {
			leadRepo.save(lead);
			} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getById(long id) {
	 Optional<Lead> findById = leadRepo.findById(id);
	 Lead lead = findById.get();
		
		return lead;
	}

	@Override
	public void deleteLead(long id) {
	leadRepo.deleteById(id);
		
	}

	


		
		
	}


