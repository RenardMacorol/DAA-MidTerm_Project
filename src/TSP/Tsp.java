package src.TSP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Tsp {
    Scanner s = new Scanner(System.in);
    Graph graph = new Graph(5); 
    int shortestDistance= Integer.MAX_VALUE;
    int[] shortestDistanceValues = new int[5];
    int[] shortestPath = new int[5];
    public Tsp() {
        String[] locationArr = { "Tree House", "Candy Kingdom", "Farm World", "Ice Kingdom", "Beutopia" };

        
        /* */
        graph.addEdge(0, 1, 200);
        graph.addEdge(0, 2, 135);
        graph.addEdge(0, 3, 330);
        graph.addEdge(0, 4, 425);

        graph.addEdge(1, 0, 200);
        graph.addEdge(1, 2, 175);
        graph.addEdge(1, 3, 400);
        graph.addEdge(1, 4, 315);

        graph.addEdge(2, 0, 135);
        graph.addEdge(2, 1, 175);
        graph.addEdge(2, 3, 380);
        graph.addEdge(2, 4, 261);

        graph.addEdge(3, 0, 330);
        graph.addEdge(3, 1, 400);
        graph.addEdge(3, 2, 380);
        graph.addEdge(3, 4, 127);

        graph.addEdge(4, 1, 425);
        graph.addEdge(4, 2, 315);
        graph.addEdge(4, 3, 261);
        graph.addEdge(4, 0, 127);
        
        
        int[] node ={0,1,2,3,4};
        graph.print(locationArr);
        System.out.println("Enter Number of location you want to start: ");
        int input = s.nextInt()-1;
        ArrayList<int[]> res = permute(node);
        for (int[] x : res) {
            if(x[0]==input){
                int[] arr = new int[locationArr.length];
                for (int y : x) {
                    
                    arr[y]=x[y];
                    //System.out.print(y + " ");
                }
                //System.out.println();
                compare(arr);
            }
            
        }
        for(int i=0;i<locationArr.length;i++){
            
            System.out.print(locationArr[shortestPath[i]]+" "+shortestDistanceValues[i]+" "+" > ");
            
        }
        System.out.print(locationArr[shortestPath[0]]);
        System.out.println("Total Distance "+ shortestDistance);
        
       
    }
    
    
    

    private ArrayList<int[]> permute(int[] locationArr) {
        ArrayList<int[]> res = new ArrayList<int[]>();
        int x = locationArr.length - 1;

        // Calling permutations for the first
        // time by passing l
        // as 0 and h = nums.size()-1
        permutations(res, locationArr, 0, x);
        return res;
    }
    private void compare(int[] arr) {
        int  tempDistance=0;
        int[] distanceArr= new int[5];
        for(int i=0;i<=arr.length-2;i++){
                tempDistance+=graph.getMatrix()[arr[i]][arr[i+1]];
                distanceArr[i]=graph.getMatrix()[arr[i]][arr[i+1]];
                //System.out.println(arr[i]+" "+arr[i+1]);
                //System.out.println(graph.getMatrix()[arr[i]][arr[i+1]]);
        }
        tempDistance+=graph.getMatrix()[arr.length-1][0];
        distanceArr[arr.length-1]=graph.getMatrix()[arr.length-1][0];
        if(shortestDistance>tempDistance){
            shortestDistance=tempDistance;
            shortestPath= arr.clone();
            shortestDistanceValues=distanceArr.clone();
            }
        }

    private void permutations(ArrayList<int[]> res, int[] locationArr, int l, int h) {
        // Base case
        // Add the array to result and return
        if (l == h) {
            res.add(Arrays.copyOf(locationArr, locationArr.length));
            return;
        }

        // Permutations made
        for (int i = l; i <= h; i++) {
            // Swapping
            swap(locationArr, l, i);

            // Calling permutations for
            // next greater value of l
            permutations(res, locationArr, l + 1, h);

            // Backtracking
            swap(locationArr, l, i);
        }
    }

    private void swap(int[] locationArr, int l, int i) {
        int temp = locationArr[l];
        locationArr[l] = locationArr[i];
        locationArr[i] = temp;
    }
}