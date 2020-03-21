package com.company;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class PersonService {

    private static final String NAME = "Geef naam van een persoon";
    private static final String SECOND_NAME = "Geef achternam van een persoon";

    private static Scanner scanner = new Scanner(System.in);
    private CompanyService companyService;
    private AddressService addressService;

    public PersonService(CompanyService companyService, AddressService addressService) {
        this.companyService = companyService;
        this.addressService = addressService;
    }

    public Person createPersonFromUserInput() {
        print(NAME);
        String name = scanner.nextLine();
        print(SECOND_NAME);
        String secondName = scanner.nextLine();
        return new Person(name, secondName, companyService.createCompanyFromUserInput(), addressService.createAddressFromUserInput());
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
