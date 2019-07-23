package com.mediaocean.repository;

import com.mediaocean.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Prashant");
        customer.setLastname("Vishwakarma");

        customers.add(customer);

        return customers;
    }
}
