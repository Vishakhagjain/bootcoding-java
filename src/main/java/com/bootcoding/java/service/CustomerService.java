package com.bootcoding.java.service;

import com.bootcoding.java.model.Customer;

import java.util.Date;

public class CustomerService {
    public void registerCustomer(){
        Customer customer=new Customer();
        customer.setId(1);
        customer.setCity("chandrapur");
        customer.setName("ankit");
        customer.setDeliveryAddress("vakil peth");
        customer.setEmailId("vishakhaj320@gmail.com");
        customer.setCreatedAt(new Date());
        customer.setModifiedAt(new Date());
        customer.setState("maharashtra");
        customer.print();
        System.out.println("customer has been registered successfully");
    }

}
