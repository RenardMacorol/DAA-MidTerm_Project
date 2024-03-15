package src.Test;

import src.KnapAndSort.*;
import src.TSP.Tsp;

public class TestAllAlgs {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Test Output 200" + i);
            new SpeedAnalysis(new Tsp(i));
        }
       


    }
}
