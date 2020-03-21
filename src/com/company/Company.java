package com.company;

import java.util.Scanner;

public class Company {
    private static final String COMPANY_NAME_INPUT_MSG = "Geef naam van de bedrijf aan";
    private static final String BERICHT_VOOR_ADRES = "Nu gaat u adres van bedrijf formulier invullen";
    private Address address;
    private String name;

    public Company() {
        print(COMPANY_NAME_INPUT_MSG);
        this.name = getInputFromUser();
        print(BERICHT_VOOR_ADRES);
        this.address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
    public void printBedrijfGegevenies(){
        System.out.println("Bedrijfnaam " + name);
        System.out.println("Adres staat onderaan" + "\n");
        address.printAddressGegevenies();
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
