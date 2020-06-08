package service;

import model.Customer;

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
        return new Customer();
    }

    public Customer updateCustomer(String id, Customer customer){
        return new Customer();
    }

    public void removeCustomer (String id){

    }
}
