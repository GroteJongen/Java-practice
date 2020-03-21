package com.company;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class PersonService {
    private static final String COMPANY_NAME_INPUT_MSG = "Geef naam van de bedrijf aan";
    private static final String BERICHT_VOOR_ADRES = "Nu gaat u adres van bedrijf formulier invullen";
    private static final String STRAAT = "Geef straat aan";
    private static final String HUIS_NUMMER = "Geef nummer aan";
    private static final String POST_CODE = "Geef postcode aan";
    private static final String STAD = "Geef de stad naam aan";
    private static final String NAME = "Geef naam van een persoon";
    private static final String SECOND_NAME = "Geef achternam van een persoon";


    private Person person;
    private CompanyService companyService;
    private AddressService addressService;

    public Person createPersonFromUserInput() {
        print(NAME);
        String name = getUserInput();
        print(SECOND_NAME);
        String secondName = getUserInput();
        return new Person(name, secondName, companyService.createCompanyFromUserInput(), addressService.createAddressFromUserInput());
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String andrzej = scanner.nextLine();
        return andrzej;
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
