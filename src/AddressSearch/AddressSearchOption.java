package src.AddressSearch;

import src.Frame6;
import java.util.ArrayList;
import java.util.List;

public class AddressSearchOption {
    private List<String> addresses;
    private Frame6 frame;

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

    public void performSearch() {
        String userInput = frame.getUserInput();

        AddressSearch addressSearch = new AddressSearch(addresses);
        addressSearch.search(userInput);
    }
}
