package AddressSearch;
import java.util.List;

class AddressSearch {
    private List<String> addresses;

    // constructor initializes the list of addresses
    public AddressSearch(List<String> addresses) {
        this.addresses = addresses;
    }

    // to search for occurrences of user input in addresses
    public void search(String userInput) {
        userInput = userInput.toLowerCase();

        int totalMatches = 0;

        // print HEADER
        System.out.println("\nSearch Address: " + userInput);
        System.out.println("Matched Address:");

        for (String address : addresses) {
            String lowerCaseAddress = address.toLowerCase();
            int index = lowerCaseAddress.indexOf(userInput);
            int occurrences = 0;

            while (index != -1) {
                occurrences++;

                // calculate the position of the user input in the current address
                int position = countSpaces(lowerCaseAddress.substring(0, index + 1)) + 1;

                // print address only for the first occurrence to avoid repetition
                if (occurrences == 1) {
                    System.out.println("  - " + address);
                }

                // print searched position and occurrence
                System.out.println("      Searched position: at position " + position);
                System.out.println("      Number of occurrences: " + occurrences);

                // proceed to the next occurrence
                index = lowerCaseAddress.indexOf(userInput, index + 1);
            }

            // if there were any occurrences in the current address, increment the total matches
            if (occurrences > 0) {
                totalMatches++;
            }
        }

        // print the total number of matching addresses or "No matches found."
        if (totalMatches > 0) {
            System.out.println("\n" + totalMatches + " address found.");
        } else {
            System.out.println("\nNo matches found.");
        }
    }

    // helper method to count spaces in a string
    private int countSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
}
