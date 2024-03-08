package CustomerDelivery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShortestPath {
    public  Map<String,Integer> shortestPath(int[][] graph, String[] locations,String startLocation) {
        int numVertices = graph.length;
        Map<String,Integer> locationToIndex = new HashMap<>();
        //map all in grap stPeter goes hasmap index 0
        for(int i =0; i< numVertices;i++){
            locationToIndex.put(locations[i], i);
        }
        Integer startIndex = locationToIndex.get(startLocation);
       
        int[] distance = new int[numVertices];
        boolean[] isVisited = new boolean[numVertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(isVisited, false);

        distance[startIndex] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int  minVertex = findMinVertex(distance, isVisited);
            isVisited[minVertex] = true;

            for (int j = 0; j < numVertices; j++) {
                if (graph[minVertex][j] != 0 && !isVisited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDistance = distance[minVertex] + graph[minVertex][j];
                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
        }

        Map<String,Integer> shortestDistance = new HashMap<>();
        for(int i =0; i < numVertices;i++){
            if(locations[i]!=locations[startIndex]){
                shortestDistance.put(locations[i], distance[i]);
            }
           
        }
        return shortestDistance;
    }

    private int findMinVertex(int[] distance, boolean[] isVisited) {
        int minVertex = 0;
        for (int i = 0; i < distance.length; i++) {
            if (!isVisited[i] && (minVertex == -1) || distance[i] < distance[minVertex]) {
                minVertex = i;
            }
        }
        return minVertex;
    }

}
