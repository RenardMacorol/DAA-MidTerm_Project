import java.util.Scanner;

public class KnapsackMain {
    public static void main(String[] args) {


        Operation op = new Operation();
        op.printChoices();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your cart size: ");
        int cart = sc.nextInt();

        op.printFeasible(cart);
        op.printSort();

        sc.close();
    }
}



