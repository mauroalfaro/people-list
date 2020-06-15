package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.builders.CustomerMockDataBuilder;
import com.alfarosoft.peoplelist.exception.PeopleListException;
import com.alfarosoft.peoplelist.model.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    private CustomerMockDataBuilder customerMockDataBuilder;
    private List<Customer> customerList;

    public CustomerService() {
        this.customerMockDataBuilder = new CustomerMockDataBuilder();
        customerList = customerMockDataBuilder.buildMockedData();
    }

    public Customer getCustomer(String id){
        if(customerList.stream().anyMatch(customer1 -> customer1.getId().equals(id))){
            Optional<Customer> customerOptional = customerList.stream().filter(customer -> customer.getId().equals(id)).findFirst();
            if (customerOptional.isPresent()){
                return customerOptional.get();
            }
        }
        throw new PeopleListException("Customer with id " + id + " not found");
    }

    public List<Customer> getCustomers(){
        return customerList;
    }

    public Customer addCustomer (Customer customer){
        if(customerList.stream().noneMatch(customer1 -> customer1.getName().equals(customer.getName()))){
            customerList.add(customer);
        }
        return customer;
    }

    public Customer updateCustomer(String id, Customer customer){
        return customer;
    }

    public void removeCustomer (String id){
        if(customerList.stream().anyMatch(customer1 -> customer1.getId().equals(id))){
            Optional<Customer> customerOptional = customerList.stream().filter(customer -> customer.getId().equals(id)).findFirst();
            customerOptional.ifPresent(customer -> customerList.remove(customer));
        }
        else{
            throw new PeopleListException("Customer with id " + id + " not found");
        }
    }
}
