import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Canned Goods", "5", 450),
                new Product("Cooking Oil", "3", 725),
                new Product("Noodles", "2.5", 375),
                new Product("Soap", "7", 500)
        };

        Scanner sort = new Scanner(System.in);

        // Sort by weight
        Product[] productsByWeight = sortByWeight(products);
        displayTable(productsByWeight);

        System.out.print("\nWhat product/s will you purchase? (Enter product numbers with space): ");
        String[] purchaseChoices = sort.nextLine().split(" ");

        int totalAmount = 0; 

        System.out.println("\nSelected products:");
        for (String choice : purchaseChoices) {
            int index = Integer.parseInt(choice) - 1;
            if (index >= 0 && index < productsByWeight.length) {
                Product selectedProduct = productsByWeight[index];
                System.out.println(selectedProduct.name + " - " + selectedProduct.amount);
                totalAmount += selectedProduct.amount;
            }
        }

        System.out.println("\nTotal amount: " + totalAmount);
        System.out.println("\nThank you for shopping!");
    }

    // Method to sort by product weight
    static Product[] sortByWeight(Product[] arr) {
        Product[] sortedArray = arr.clone();
        int n = sortedArray.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (Double.parseDouble(sortedArray[j].weight) < Double.parseDouble(sortedArray[minIndex].weight)) {
                    minIndex = j;
                }
            }
            Product temp = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = temp;
        }
        return sortedArray;
    }

    // Method to display the product table
    static void displayTable(Product[] arr) {
        System.out.println("\n   Product name               Weight/box            Amount");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d. %-30s%-20s%d\n", i + 1, arr[i].name, arr[i].weight, arr[i].amount);
        }
    }
}
