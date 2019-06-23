package com.hcl.oxbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.oxbank.Model.CustomerDetails;
import com.hcl.oxbank.service.customerServiceImpl;

@RestController
public class CustomerController {	
	
	@Autowired
	customerServiceImpl customImpl;
	
	/*@PostMapping("/addcustomer")
	public ResponseEntity<CustomerDetails> addCustomer(@RequestBody CustomerDetails customDetails)	{
		
		return ResponseEntity.ok(customImpl.addCustomer(customDetails));
	}*/
	
	
	@PostMapping("/addcustomer")
	public String addCustomer(@RequestBody CustomerDetails customDetails)	{
		
		return customImpl.addCustomer(customDetails);
	}

}
