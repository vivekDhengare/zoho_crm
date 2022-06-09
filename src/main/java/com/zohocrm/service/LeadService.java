package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public List<Lead> findAllLeads();

	public Lead getById(long id);

	public void deleteLead(long id);


	

}
