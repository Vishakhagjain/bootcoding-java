package com.bootcoding.java.service;

import com.bootcoding.java.model.Order;
import com.bootcoding.java.model.OrderStatus;

public class OrderService {
    public boolean createOrder()
    {
        Order order =new Order();
        order.setId(1);
        order.setDeliveryAddress("vakil peth hazarewadi");
        order.setCustomerId(2);
        order.setVendorId(6);
        order.setTotalPrice(500);
        order.print();
        System.out.println("order has been placed successfully");
        double price=applyDiscount(order.getTotalPrice());
        System.out.println("total price after applying discount is "+ price);
        return true;
    }

    public double applyDiscount(double TotalPrice){
        double discount=TotalPrice*0.1;
        double finalAmount=TotalPrice-discount;
        return finalAmount;
    }
}
