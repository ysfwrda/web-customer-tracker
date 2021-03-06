package com.abouwarda.springdemo.dao;

import com.abouwarda.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
