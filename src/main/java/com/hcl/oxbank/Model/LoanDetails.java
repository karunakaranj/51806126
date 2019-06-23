package com.hcl.oxbank.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loandetails")
public class LoanDetails {

	
	@Id
	@GeneratedValue
	private int id;
	
	private String loanaccountnumber;
	private String loanstatus;
	private int loanamount;	
	private int loanmanagerid;
	
	@OneToOne
	@JoinColumn(name="id")
	CustomerDetails customerDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanaccountnumber() {
		return loanaccountnumber;
	}

	public void setLoanaccountnumber(String loanaccountnumber) {
		this.loanaccountnumber = loanaccountnumber;
	}

	public String getLoanstatus() {
		return loanstatus;
	}

	public void setLoanstatus(String loanstatus) {
		this.loanstatus = loanstatus;
	}

	public int getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}

	public int getLoanmanagerid() {
		return loanmanagerid;
	}

	public void setLoanmanagerid(int loanmanagerid) {
		this.loanmanagerid = loanmanagerid;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	
}
