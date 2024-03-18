package src.AddressSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressSearchOption {
    public AddressSearchOption() {
        // creates a list of addresses and add sample addresses
        List<String> addresses = new ArrayList<>();
        // adds address to the list
        addresses.add("234 Bubble Gum Street, Candy Kingdom, Land Of Ooo");
        addresses.add("154 Marceline Street, Tree House, Land of Ooo");
        addresses.add("617 Finn Street, Farm World, Land of Ooo");
        addresses.add("192 Ice King Street, Ice Kingdom, Land of Ooo");
        addresses.add("808 Jake Street, Beautopia, Land of Ooo");

        // creates an instance of AddressSearch, passing the list of addresses
        AddressSearch addressSearch = new AddressSearch(addresses);

        // get user input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter search string: ");
            String userInput = scanner.nextLine();

            // call search method that will perform the address search
            addressSearch.search(userInput);
        }
    }

}