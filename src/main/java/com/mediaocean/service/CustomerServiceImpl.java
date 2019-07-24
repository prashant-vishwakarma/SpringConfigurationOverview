package com.mediaocean.service;

import com.mediaocean.model.Customer;
import com.mediaocean.repository.CustomerRepository;
//import com.mediaocean.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl(){}

    @Autowired //Constructor Autowired Use Carefully: Eliminates Default Constructor
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("Constructor Injection Called");
        this.customerRepository = customerRepository;
    }

    //@Autowired //For Setter Injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter Injection Called");
        this.customerRepository = customerRepository;
    }

    //private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
    //@Autowired  //Use for Member Variable Injection
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
