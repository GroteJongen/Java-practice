package com.company;

import java.util.Scanner;

public class CompanyService {
    private static final String COMPANY_NAME_INPUT_MSG = "Geef naam van de bedrijf aan";
    private static final String BERICHT_VOOR_ADRES = "Nu gaat u adres van bedrijf formulier invullen";

    private static Scanner scanner = new Scanner(System.in);
    private AddressService addressService;

    public CompanyService(AddressService addressService) {
        this.addressService = addressService;
    }

    public Company createCompanyFromUserInput() {
        print(COMPANY_NAME_INPUT_MSG);
        String companyNaam = scanner.nextLine();
        print(BERICHT_VOOR_ADRES);
        return new Company(addressService.createAddressFromUserInput(), companyNaam);
    }

    private void print(String msg) {
        System.out.println(msg);
    }

}
