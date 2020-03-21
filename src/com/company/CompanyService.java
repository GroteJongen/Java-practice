package com.company;

import java.util.Scanner;

public class CompanyService {
    private static final String COMPANY_NAME_INPUT_MSG = "Geef naam van de bedrijf aan";
    private static final String BERICHT_VOOR_ADRES = "Nu gaat u adres van bedrijf formulier invullen";

    private AddressService addressService;
    public Company createCompanyFromUserInput() {
        print(COMPANY_NAME_INPUT_MSG);
        String companyNaam = getUserInput();
        print(BERICHT_VOOR_ADRES);
        return new Company(addressService.createAddressFromUserInput(), companyNaam);
    }

    private void print(String msg) {
        System.out.println(msg);
    }
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String andrzej = scanner.nextLine();
        return andrzej;
    }
}
