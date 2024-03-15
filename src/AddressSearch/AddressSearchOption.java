package src.AddressSearch;

import src.Frame6;
import java.util.ArrayList;
import java.util.List;

// Class for handling address search options
public class AddressSearchOption {
    private List<String> addresses; // List of addresses
    private Frame6 frame; // Reference to the Frame6 instance

    // Constructor to initialize the list of addresses and the frame
    public AddressSearchOption(Frame6 frame) {
        this.frame = frame;
        // Initialize the addresses list with sample addresses
        addresses = new ArrayList<>();
        addresses.add("234 Bubble Gum Street, Candy Kingdom, Land Of Ooo");
        addresses.add("154 Marceline Street, Tree House, Land of Ooo");
        addresses.add("617 Finn Street, Farm World, Land of Ooo");
        addresses.add("192 Ice King Street, Ice Kingdom, Land of Ooo");
        addresses.add("808 Jake Street, Beautopia, Land of Ooo");
    }

    // Method to perform address search based on user input
    public void performSearch() {
        String userInput = frame.getUserInput(); // Get user input from the frame

        // Create an instance of AddressSearch and perform the search
        AddressSearch addressSearch = new AddressSearch(addresses);
        addressSearch.search(userInput);
    }
}