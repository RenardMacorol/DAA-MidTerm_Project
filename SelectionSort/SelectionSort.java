package SelectionSort;
import java.util.*;

public class SelectionSort {
    public SelectionSort(){
        Product[] products = {
            new Product("Canned Goods", "5", 450),
            new Product("Cooking Oil", "3", 725),
            new Product("Noodles", "2.5", 375),
            new Product("Soap", "7", 500)
    };

    Scanner sort = new Scanner(System.in);

    sortByName(products);
    displayTable(products);

    System.out.print("\nWhat product/s will you purchase? (Enter product numbers with space): ");
    String[] purchaseChoices = sort.nextLine().split(" ");

    int totalAmount = 0; 

    System.out.println("\nSelected products:");
    for (String choice : purchaseChoices) {
        int index = Integer.parseInt(choice) - 1;
        if (index >= 0 && index < products.length) {
            Product selectedProduct = products[index];
            System.out.println(selectedProduct.name + " - " + selectedProduct.amount);
            totalAmount += selectedProduct.amount;
        }
    }

    System.out.println("\nTotal amount: " + totalAmount);
    System.out.println("\nThank you for shopping!");
    }
    
    void sortByName(Product[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].name.compareTo(arr[minIndex].name) < 0) {
                    minIndex = j;
                }
            }
            Product temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void displayTable(Product[] arr) {
        System.out.println("\n   Product name               Weight/box            Amount");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d. %-30s%-20s%d\n", i + 1, arr[i].name, arr[i].weight, arr[i].amount);
                                                                                                       
        }
    }
}
