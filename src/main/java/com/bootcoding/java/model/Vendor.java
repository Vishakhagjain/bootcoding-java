package com.bootcoding.java.model;

import java.util.Date;

public class Vendor {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private long id;
    private String name;
    private String state;
    private String city;
    private Date registrationDate;
    private Date modifiedDate;
    private boolean approved;
    private double latitude;
    private double longitude;

    public void print(){

        System.out.println(getCity());
        System.out.println(getLatitude());
        System.out.println(getLongitude());
        System.out.println(getName());
        System.out.println(getModifiedDate());
        System.out.println(getRegistrationDate());
        System.out.println(getState());
    }

}
