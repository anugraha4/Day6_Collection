package com.nestjavatraining.sortingdemo;

import java.util.*;

public class Sorting {
	
	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Anu",22));
		customerList.add(new Customer("Ajish",27));
		customerList.add(new Customer("Ashna",23));
		customerList.add(new Customer("Gokul",25));
		customerList.add(new Customer("Amala",30));
		customerList.add(new Customer("Ashwin",40));
		customerList.add(new Customer("Jeffrey",15));
		System.out.println("");
		System.out.println("Customer list before sorting\n");
		System.out.println("Customer Name"+" "+"Customer Age");
		for(Customer customer : customerList) {
			
			System.out.println(customer.getCustomerName()+ "  "+customer.getCustomerAge());
		}
		
		System.out.println("");
		System.out.println("Customer list after sorting based on age\n");
		System.out.println("Customer Name"+" "+"Customer Age");
		Collections.sort(customerList);
		for(Customer customer : customerList) {
			
			System.out.println(customer.getCustomerName()+ "  "+customer.getCustomerAge());
		}
		
		}

}
