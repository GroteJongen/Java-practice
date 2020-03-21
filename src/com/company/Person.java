package com.company;



import java.util.Scanner;

public class Person {
   private static final String NAME = "Geef naam van een persoon";
   private static final String SECOND_NAME = "Geef achternam van een persoon";
   private static final String BERICHT_VOOR_ADRES = "Nu gaat u adres van person formulier invullen";
   private static final String DE_MEEST_BELANGRIJK_BERICHT_OOIT = "Vul bedrijf gegevenies in";
    private String name;
   private String secondName;
   private Company company;
   private Address address;

    public Person() {
        print(NAME);
        this.name = getInputFromUser();
        print(SECOND_NAME);
        this.secondName = getInputFromUser();
        print(DE_MEEST_BELANGRIJK_BERICHT_OOIT);
        this.company = new Company();
        print(BERICHT_VOOR_ADRES);
        this.address = new Address();
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
    public void printPersoonGegevenies(){
        System.out.println("Naam " + name);
        System.out.println("Achternaam " + secondName);
        company.printBedrijfGegevenies();
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
