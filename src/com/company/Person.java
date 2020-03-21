package com.company;



import java.util.Scanner;

public class Person {

   private String name;
   private String secondName;
   private Company company;
   private Address address;

    public Person(String name, String secondName, Company company, Address address) {
        this.name = name;
        this.secondName = secondName;
        this.company = company;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Company getCompany() {
        return company;
    }

    public Address getAddress() {
        return address;
    }
}
