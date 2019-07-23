package com.mediaocean.service;

import com.mediaocean.model.Customer;
import com.mediaocean.repository.CustomerRepository;
import com.mediaocean.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
