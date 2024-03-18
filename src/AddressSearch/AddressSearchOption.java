//AddressSearOption.java Class
package src.AddressSearch;


import src.Frame6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Class for handling address search options
public class AddressSearchOption {
    private List<String> addresses; // List of addresses
    private String input; // Reference to the Frame6 instance
    private String pass;


    // Constructor to initialize the list of addresses and the frame
    public AddressSearchOption(String input) {
        this.input = input;
        // Initialize the addresses list with sample addresses
        addresses = new ArrayList<>();
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
