package AddressSearch;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressSearchOption {
    public static void main(String[] args) {

        // creates a list of addresses and add sample addresses
        List<String> addresses = new ArrayList<>();
        //adds address to the list
        addresses.add("1 St. Peter Street, Peter Subdivision, Culiat, Quezon City");
        addresses.add("2 Main Street, Main Subdivision, Mainland, Main City");
        addresses.add("1 St. John Street, Peter Subdivision, Culiat, Quezon City");

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