package src.Test;


import src.TSP.Tsp;

public class SpeedAnalysis {
    public SpeedAnalysis(Tsp tsp){
        long nanos = System.nanoTime();
        // execute your stuff
        long duration = System.nanoTime() - nanos;
        int seconds = (int) (duration / 1000000000);
        int milliseconds = (int) (duration / 1000000) % 1000;
        int nanoseconds = (int) (duration % 1000000);
        System.out.printf("%d seconds, %d milliseconds en %d nanoseconds\n", seconds, milliseconds, nanoseconds);

    }

    
    
    
}
