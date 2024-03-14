package src.Knapsack;

import java.util.Scanner;

public class KnapsackMain {
    public KnapsackMain(){
        Operations op = new Operations();
        op.printChoices();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your cart size: ");
        int cart = sc.nextInt();

        op.printFeasible(cart);
        op.printSort();

        sc.close();
    }

}
