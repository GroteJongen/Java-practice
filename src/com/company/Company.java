package com.company;

import java.util.Scanner;

public class Company {
    private Address address;
    private String name;

    public Company(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
