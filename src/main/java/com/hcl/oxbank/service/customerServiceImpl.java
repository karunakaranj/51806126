package com.hcl.oxbank.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.oxbank.Exception.CustomerException;
import com.hcl.oxbank.Model.CustomerDetails;
import com.hcl.oxbank.repository.CustomerRepository;

@Service
public class customerServiceImpl {
	
	@Autowired
	CustomerRepository customerRepo;
	
	CustomerException customerException;
	

	public String addCustomer(CustomerDetails customerDetails) 
	{
		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		dateFormat.format(date);

		String sDate1=customerDetails.getDob();  
	    Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");                           
	    int d1 = Integer.parseInt(formatter.format(date1));                            
	    int d2 = Integer.parseInt(formatter.format(date));                          
	    int age = (d2 - d1);	*/	
		
		if(customerDetails.getCreditscore() < 900)
		{
			return "credit score is less";
		}else if(customerDetails.getSalary() < 20000)
		{
			return "salary is less";
		}/*else if(age > 24 && age <= 40)
		{
			return "age is not sufficient to give loan";
		}*/
		customerRepo.save(customerDetails);
		return "success";
		
	}
	
}
