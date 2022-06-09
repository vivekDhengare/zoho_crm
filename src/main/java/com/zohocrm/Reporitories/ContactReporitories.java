package com.zohocrm.Reporitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Contact;

public interface ContactReporitories extends JpaRepository<Contact, Long> {

}
