package com.Project.TSP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;


public class Tsp {
    String outputPath;
    String outputDistance;
    Graph graph = new Graph(5);
    int shortestDistance = Integer.MAX_VALUE;
    int[] shortestDistanceValues = new int[5];
    int[] shortestPath = new int[5];
    int input;

    public Tsp(int input) {
        this.input = input;
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

        graph.addEdge(4, 0, 425);
        graph.addEdge(4, 1, 315);
        graph.addEdge(4, 2, 261);
        graph.addEdge(4, 3, 127);

        // graph.print(locationArr);
        int[] node = { 0, 1, 2, 3, 4 };
        StringBuilder locations = new StringBuilder();
        StringBuilder distanceString = new StringBuilder();
        ArrayList<int[]> res = permute(node);
        for (int[] x : res) {
            if (x[0] == input) {
                int[] arr = new int[locationArr.length];
                for (int y : x) {

                    arr[y] = x[y];
                    // System.out.print(y + " ");
                }
                // System.out.println();
                compare(arr);
            }

        }
        for (int i = 0; i < shortestPath.length; i++) {
            System.out.print(shortestPath[i]);
        }
        for (int i = 0; i < locationArr.length; i++) {
            locations.append(locationArr[shortestPath[i]] + " " + " -> ");
            if(i==locationArr.length-1){
                distanceString.append(shortestDistanceValues[i]+" ");
            }else{
                distanceString.append(shortestDistanceValues[i]+" + ");
            }
            

        }
        locations.append(locationArr[shortestPath[0]]);
        distanceString.append(" = "+shortestDistance+" units ");


        outputPath = locations.toString();
        outputDistance = distanceString.toString();
        System.out.print(locations.toString());
        System.out.println(+shortestDistance);

    }

    public String getOuput() {
        return outputPath;
    }

    public String getOutputDistance() {
        return outputDistance;
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
        int tempDistance = 0;
        int[] distanceArr = new int[5];
       
        for (int i = 0; i <= arr.length - 2; i++) {
            tempDistance += graph.getMatrix()[arr[i]][arr[i + 1]];
            distanceArr[i] = graph.getMatrix()[arr[i]][arr[i + 1]];
            
            
        }

      

        tempDistance += graph.getMatrix()[input][arr[arr.length-1]];
        distanceArr[arr.length - 1] = graph.getMatrix()[input][arr[arr.length-1]];

        if (shortestDistance > tempDistance) {
            shortestDistance = tempDistance;
            shortestPath = arr.clone();
            shortestDistanceValues = distanceArr.clone();
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