package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Reporitories.BillingReporitories;
import com.zohocrm.entity.Billing;
@Service
public class BillingServicesImp implements BillingService {
	@Autowired
	BillingReporitories billingRepo;

	@Override
	public void generateOneBill(Billing bill) {
		billingRepo.save(bill);
		
		
	}


	

}
