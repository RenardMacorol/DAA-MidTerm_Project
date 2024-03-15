package src.AddressSearch;

import java.util.List;

// Class for searching addresses
class AddressSearch {
    private List<String> addresses; // List of addresses

    // Constructor to initialize the list of addresses
    public AddressSearch(List<String> addresses) {
        this.addresses = addresses;
    }

    // Method to search for occurrences of user input in addresses
    public void search(String userInput) {
        userInput = userInput.toLowerCase(); // Convert user input to lowercase for case-insensitive search
        int totalMatches = 0;

        // Print search header
        System.out.println("\nSearch Address: " + userInput);
        System.out.println("Matched Address:");

        // Loop through each address
        for (String address : addresses) {
            String lowerCaseAddress = address.toLowerCase(); // Convert address to lowercase for case-insensitive search
            int index = lowerCaseAddress.indexOf(userInput); // Find the index of user input in the address
            int occurrences = 0;

            // Loop through all occurrences of user input in the address
            while (index != -1) {
                occurrences++;

                // Calculate the position of the user input in the current address
                int position = countSpaces(lowerCaseAddress.substring(0, index + 1)) + 1;

                // Print the address only for the first occurrence to avoid repetition
                if (occurrences == 1) {
                    System.out.println("  - " + address);
                }

                // Print searched position and occurrence
                System.out.println("      Searched position: at position " + position);
                System.out.println("      Number of occurrences: " + occurrences);

                // Proceed to the next occurrence
                index = lowerCaseAddress.indexOf(userInput, index + 1);
            }

            // If there were any occurrences in the current address, increment the total matches
            if (occurrences > 0) {
                totalMatches++;
            }
        }

        // Print the total number of matching addresses or "No matches found."
        if (totalMatches > 0) {
            System.out.println("\n" + totalMatches + " address found.");
        } else {
            System.out.println("\nNo matches found.");
        }
    }

    // Helper method to count spaces in a string
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