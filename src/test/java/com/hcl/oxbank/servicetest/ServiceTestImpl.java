package com.hcl.oxbank.servicetest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.oxbank.Model.CustomerDetails;
import com.hcl.oxbank.repository.CustomerRepository;
import com.hcl.oxbank.service.customerServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTestImpl {
	
	
	@InjectMocks 
	customerServiceImpl custImpl;
	
	@Mock
	CustomerRepository custRepo;
	
	@Test
	public void addpositiveTest()
	{
		CustomerDetails cust = new CustomerDetails();
		cust.setCreditscore(1000);
		cust.setExpense(2000);
		cust.setGender("male");
		cust.setDob("13/06/1991");
		cust.setMaritalstatus("single");
		cust.setMobileno("9738111111");
		cust.setName("Sha");
		cust.setSalary(21000);
		
		Mockito.when(custRepo.save(cust)).thenReturn(cust);
		String actualvalue = custImpl.addCustomer(cust);
		Assert.assertEquals(actualvalue, "customer added successfully");
		
	}
	
	
	
	@Test
	public void addnegativeTestforsalary()
	{
		CustomerDetails cust = new CustomerDetails();
		cust.setCreditscore(1000);
		cust.setExpense(2000);
		cust.setGender("male");
		cust.setDob("13/06/1991");
		cust.setMaritalstatus("single");
		cust.setMobileno("9738111111");
		cust.setName("Sha");
		cust.setSalary(8000);
		
		Mockito.when(custRepo.save(cust)).thenReturn(cust);
		String actualvalue = custImpl.addCustomer(cust);
		Assert.assertEquals(actualvalue, "salary is depreceated");
		
	}

}
