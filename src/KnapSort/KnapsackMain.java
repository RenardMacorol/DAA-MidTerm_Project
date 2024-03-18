package src.KnapSort;
import java.util.Scanner;

public class KnapsackMain {
    String outProduct;
    String outValue;
    String outWeight;
    String bestValue;
    public KnapsackMain(int input){
        
        Operation op = new Operation();
        op.printChoices();
        op.printFeasible(input);
        op.printSort();

        
        this.outProduct=op.getProductName();
        this.outValue=op.getValue();
        this.outWeight=op.getWeight();
        this.bestValue=op.getBestValue();

       
      
    }

    public String getProduct(){
        return outProduct;
    }
    public String getValue(){
        return outValue;
    }
    public String getWeight(){
        return outWeight;
    }
    public String getBestValue(){
        return bestValue;
    }


    
}


