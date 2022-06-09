package com.zohocrm.Reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Billing;

public interface BillingReporitories extends JpaRepository<Billing, Long> {

}
