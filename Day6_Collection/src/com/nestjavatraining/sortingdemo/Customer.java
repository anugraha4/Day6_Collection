package com.nestjavatraining.sortingdemo;

public class Customer {
	
	private String customerName;
	private int customerAge;
	public Customer(String customerName, int customerAge) {
		super();
		this.customerName = customerName;
		this.customerAge = customerAge;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	public int compareTo(Customer o)
	{
		if(this.customerAge==o.customerAge) {
			
			return 0;
			
		}
		else {
			
			return -1;
		}
	}

}
