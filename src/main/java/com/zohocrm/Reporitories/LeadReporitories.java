package com.zohocrm.Reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Lead;

public interface LeadReporitories extends JpaRepository<Lead, Long> {

}
