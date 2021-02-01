package com.anubhav.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anubhav.entity.Vendor;

@RestController
public class VendorController {
	
	HashMap<String,Vendor> vendors = new HashMap<String, Vendor>();
	@Autowired
	Vendor x;
	@Autowired
	Vendor y;
	@Autowired
	Vendor z;
	@Autowired
	Vendor e;
    public void init() {
    	
    	
    }
	
	@RequestMapping("/getVendors")
	public HashMap<String, Vendor> getVendors() {
		//Vendor anubhav = new Vendor();
		fillVendor();
		return vendors;
	}
	
	@RequestMapping("/getVendors/{vendorCode}")
	public Vendor getVendorById(@PathVariable("vendorCode") String code) {
		//Vendor anubhav = new Vendor();
        System.out.println(vendors);
        fillVendor();
		return (Vendor)vendors.get(code);
	}
	
	@PostMapping("/vendor")
	public Vendor createVendor(@RequestBody Vendor vendor) {
		//Vendor anubhav = new Vendor();
		return vendor;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/changeInfo")
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		//Vendor anubhav = new Vendor();
		return vendor;
	}
	
	private void fillVendor() {
		
		vendors.put("1", x);
        vendors.put("2", y);
        vendors.put("3", z);
        vendors.put("4", e);
	}
	
	
}
