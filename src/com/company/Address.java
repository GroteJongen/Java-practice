package com.company;

import java.util.Scanner;

public class Address {
    private static final String STRAAT = "Geef straat aan";
    private static final String HUIS_NUMMER = "Geef nummer aan";
    private static final String POST_CODE = "Geef postcode aan";
    private static final String STAD = "Geef de stad naam aan";

    private String street;
    private String homeNumber;
    private String city;
    private String postalCode;

    public Address() {
        print(STRAAT);
        this.street = getInputFromUser();
        print(HUIS_NUMMER);
        this.homeNumber = getInputFromUser();
        print(STAD);
        this.city = getInputFromUser();
        print(POST_CODE);
        this.postalCode = getInputFromUser();
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
    public void printAddressGegevenies(){
        System.out.println("Straat " + street);
        System.out.println("Huis nummer " + homeNumber);
        System.out.println("Strad " + city);
        System.out.println("Post code " + postalCode);

    }

    private String getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        String andrzej = scanner.nextLine();
        return andrzej;
    }
    private void print(String msg){
        System.out.println(msg);
    }
}
