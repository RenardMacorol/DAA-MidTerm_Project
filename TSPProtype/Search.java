package TSPProtype;


import java.util.Arrays;

public class Search {
    //Exaustice search 
    private int  numVertices;
    private boolean[] isVisited;
    private int[] distance;
    private int[][] graph;
    private int start;
    Search(int[][] graph, int start){
        this.graph=graph;
        this.start=start;
        numVertices = graph.length;
        isVisited = new boolean[numVertices];
        distance = new int[numVertices];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(isVisited, false);
        distance[start] =0;
        shortestPath();
        displayShortestPath();
        
        
    }

    private void shortestPath(){
        for(int i = 0; i < numVertices-1; i++){
            int minVertex = findMinVertex(distance,isVisited);
            isVisited[minVertex]=true;
            for(int j =0; j < numVertices; j++){
                if(graph[minVertex][j] != 0 && !isVisited[j] && distance[minVertex] != Integer.MAX_VALUE){
                  int newDistance = distance[minVertex] + graph[minVertex][j];
                  if(newDistance<distance[j]){
                    distance[j] = newDistance;
                  }

                }
            }
        }
    }

    private void displayShortestPath(){
        System.out.println("Shortest distance from vertex "+ start + ":");
        for(int i =0; i < numVertices; i++){
            System.out.println("Vertex "+ i + ": "+ distance[i]);
        }
    }

    public  int findMinVertex(int[] distance,boolean[] isVisited){
        int minVertex = -1;
        for(int i =0; i< distance.length;i++){
            if(!isVisited[i]&& (minVertex==-1|| distance[i]< distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }


}
