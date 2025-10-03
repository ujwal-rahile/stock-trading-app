package com.stockapp.customerservice.controller;

import com.stockapp.customerservice.model.Customer;
import com.stockapp.customerservice.service.CustomerService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.findAll();
    }
}