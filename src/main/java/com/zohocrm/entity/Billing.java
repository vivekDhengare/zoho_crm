package com.zohocrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Billing {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	@Column(name="first_name",nullable = false,length = 48)
	private String firstName;
	@Column(name="last_name",length = 48,nullable = false)
	private String lastName;
	@Column(name="email",nullable = false,length = 128,unique = true)
	private String email;
	@Column(name="mobile",length = 10,nullable = false,unique = true)
	private long mobile;
	@Column(name="product_Name",length = 20,nullable = false)
	private String productName;
	@Column(name="amount",length = 10,nullable = false)
	private int amount;
	@Column(name="payemnt_Methord",length = 10,nullable = false)
	private String payemntMethord;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPayemntMethord() {
		return payemntMethord;
	}
	public void setPayemntMethord(String payemntMethord) {
		this.payemntMethord = payemntMethord;
	}
	
	

}
