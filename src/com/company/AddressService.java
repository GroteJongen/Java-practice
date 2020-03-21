package com.company;

import java.util.Scanner;

public class AddressService {

    private static final String STRAAT = "Geef straat aan";
    private static final String HUIS_NUMMER = "Geef nummer aan";
    private static final String POST_CODE = "Geef postcode aan";
    private static final String STAD = "Geef de stad naam aan";

   private static Scanner scanner = new Scanner(System.in);

    public Address createAddressFromUserInput() {
        print(STRAAT);
        String street = scanner.nextLine();
        print(HUIS_NUMMER);
        String huisNummer = scanner.nextLine();
        print(POST_CODE);
        String postCode = scanner.nextLine();
        print(STAD);
        String stad = scanner.nextLine();
        return new Address(street, huisNummer, postCode, stad);
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
