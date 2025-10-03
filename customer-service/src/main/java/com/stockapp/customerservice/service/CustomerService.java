package com.stockapp.customerservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.stockapp.customerservice.model.Customer;
import com.stockapp.customerservice.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
