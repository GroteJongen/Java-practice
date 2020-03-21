package com.company;

import java.util.Scanner;

public class Address {
    private String street;
    private String homeNumber;
    private String city;
    private String postalCode;

    public Address(String street, String homeNumber, String city, String postalCode) {
        this.street = street;
        this.homeNumber = homeNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
