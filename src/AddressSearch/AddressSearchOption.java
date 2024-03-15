//AddressSearOption.java Class
package src.AddressSearch;


import src.Frame6;
import java.util.ArrayList;
import java.util.List;


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
        AddressSearch addressSearch = new AddressSearch(addresses);
        addressSearch.search(input);
        pass=addressSearch.getOutput();
        System.out.println(pass);
    }
    public String getPass(){
        return pass;
    }


   
}
