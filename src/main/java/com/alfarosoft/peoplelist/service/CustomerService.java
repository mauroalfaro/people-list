package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public CustomerService() {
    }

    public Customer getCustomer(String id){
        return new Customer();
    }

    public List<Customer> getCustomers(){
        return new ArrayList<Customer>();
    }

    public Customer addCustomer (Customer customer){
        return customer;
    }

    public Customer updateCustomer(String id, Customer customer){
        return customer;
    }

    public void removeCustomer (String id){
    }
}
