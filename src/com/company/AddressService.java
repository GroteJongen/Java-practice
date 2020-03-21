package com.company;

import java.util.Scanner;

public class AddressService {

    private static final String STRAAT = "Geef straat aan";
    private static final String HUIS_NUMMER = "Geef nummer aan";
    private static final String POST_CODE = "Geef postcode aan";
    private static final String STAD = "Geef de stad naam aan";


    public Address createAddressFromUserInput() {
        print(STRAAT);
        String street = getUserInput();
        print(HUIS_NUMMER);
        String huisNummer = getUserInput();
        print(POST_CODE);
        String postCode = getUserInput();
        print(STAD);
        String stad = getUserInput();
        return new Address(street, huisNummer, postCode, stad);
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
