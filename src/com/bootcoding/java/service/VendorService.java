package com.bootcoding.java.service;

import com.bootcoding.java.model.Vendor;

import java.util.Date;

public class VendorService{

    public void registerVendor(){

        Vendor vendor=new Vendor();
        vendor.setCity("Udaipur");
        vendor.setId(25);
        vendor.setName("Haldiram");
        vendor.setApproved(true);
        vendor.setState("maharashtra");
        vendor.setModifiedDate(new Date());
        vendor.setRegistrationDate(new Date());
        vendor.print();
        System.out.println("Vendor has been registered successfully");


    }



}
