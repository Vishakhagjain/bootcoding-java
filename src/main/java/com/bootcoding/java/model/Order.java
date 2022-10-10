package com.bootcoding.java.model;

import java.util.List;

public class Order {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderMenuItemDTO> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItemDTO> menuItems) {
        this.menuItems = menuItems;
    }

    private long id;
    private long customerId;
    private long vendorId;
    private double totalPrice;
    private String deliveryAddress;
    private OrderStatus orderStatus;
    private List<OrderMenuItemDTO> menuItems;

    public void print(){

        System.out.println(getCustomerId());

        System.out.println(getOrderStatus());

        System.out.println(getId());

        System.out.println(getTotalPrice());
        System.out.println(getCustomerId());
        System.out.println(getVendorId());




    }

}
