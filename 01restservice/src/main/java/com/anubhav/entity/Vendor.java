package com.anubhav.entity;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class Vendor {
	public String code;
	public String companyName;
	public String contactName;
	public String lastName;
	public String website;
	public String email;
	public String status;
	public Date regDate;
	

	public Vendor() {
		
		this.code = "Cod";
		this.companyName = "ABC";
		this.contactName = "ABC";
		this.lastName = "LName";
		this.website = "ABC.com";
		this.email = "email@gmail.com";
		this.status = "A";
		this.regDate = new Date();
	}

}

