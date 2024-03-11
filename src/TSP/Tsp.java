package src.TSP;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Tsp {
    Scanner s = new Scanner(System.in);

    public Tsp() {

        Graph graph = new Graph(5);
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Tree House");
        locations.add("Candy Kingdom");
        locations.add("Farm World");
        locations.add("Land of OO");
        locations.add("Beutopia");
        String[] locationArr = { "Tree House", "Candy Kingdom", "Farm World", "Land of OO", "Beutopia" };

        int input = 0;

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
        graph.print(locationArr);

        int n = graph.getSize();
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(i);
        }
        System.out.println("Choose the location you want to start");

        System.out.println("Locations:");
        for (int i = 0; i < locationArr.length; i++) {
            System.out.print(i + 1 + " " + locationArr[i] + " " + " ");

        }
        input = s.nextInt();
        System.out.println();
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
        generatePermutations(permutations, points, input-1);
        double minDistance = Double.MAX_VALUE;
        ArrayList<Integer> minTour = new ArrayList<>();
        for (ArrayList<Integer> permutation : permutations) {
            double distance = tourDistance(permutation, graph.getMatrix());
            if (distance < minDistance) {
                minDistance = distance;
                minTour = permutation;
            }
        }

        System.out.println("Minimum distance: " + minDistance);
        System.out.print("Optimal tour: " );
        minTour.forEach((i)->System.out.print(locationArr[i]+" "));
        

    }

    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    //
    // Function to calculate total distance of the tour
    private static double tourDistance(ArrayList<Integer> tour, int[][] distances) {
        double distance = 0;
        for (int i = 0; i < tour.size() - 1; i++) {
            distance += distances[tour.get(i)][tour.get(i + 1)];
        }
        distance += distances[tour.get(tour.size() - 1)][tour.get(0)]; // Returning to the starting point
        return distance;
    }

    // Function to generate all possible permutations of a given list
    private static void generatePermutations(ArrayList<ArrayList<Integer>> permutations,
            ArrayList<Integer> points, int start) {
        if (start == points.size() - 1) {
            permutations.add(new ArrayList<>(points));
        } else {
            for (int i = start; i < points.size(); i++) {
                // Swap elements
                int temp = points.get(start);
                points.set(start, points.get(i));
                points.set(i, temp);
                // Recursively generate permutations
                generatePermutations(permutations, points, start + 1);
                // Swap elements back
                temp = points.get(start);
                points.set(start, points.get(i));
                points.set(i, temp);
            }
        }
    }
}