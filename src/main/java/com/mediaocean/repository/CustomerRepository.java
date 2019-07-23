package com.mediaocean.repository;

import com.mediaocean.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
