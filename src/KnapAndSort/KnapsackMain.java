package src.KnapAndSort;
import java.util.Scanner;

public class KnapsackMain {
    public KnapsackMain(int input){
        
        Operation op = new Operation();
        op.printChoices();

        
        System.out.println("\nEnter your cart size: ");
        

        op.printFeasible(input);
        op.printSort();

      
    }


    
}



