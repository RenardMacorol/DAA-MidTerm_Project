package TSPProtype;

import java.util.Arrays;

public class Search {
    //Exaustice search 
    private int  numVertices;
    private boolean[] isVisited;
    private int[] distance;
    private int start;
    private Graph graph;
    private int totaldistance;
    private int[] isTheShortest;
    Search(Graph graph, int start){
        this.graph=graph;
        this.start=start;
        numVertices = graph.getMatrix().length;
        isVisited = new boolean[numVertices];
        distance = new int[numVertices];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(isVisited, false);
        distance[start] =0;
        possiblePath(numVertices);
        //shortestPath();
       
        
        
    }
    //recursive men
    private void possiblePath(int numVertices){
        
        for(int i = 0; i < numVertices ; i++){
            System.out.print(graph.getNode().get(i).getData()+ " ");
            
        }

        
    }

    private void shortestPath(){
        for(int i = 0; i < numVertices-1; i++){
            int minVertex = findMinVertex(distance,isVisited);
            isVisited[minVertex]=true;
            for(int j =0; j < numVertices; j++){
                if(graph.getMatrix()[minVertex][j] != 0 && !isVisited[j] && distance[minVertex] != Integer.MAX_VALUE){
                  int newDistance = distance[minVertex] + graph.getMatrix()[minVertex][j];
                  if(newDistance<distance[j]){
                    distance[j] = newDistance;
                  }

                }
            }
        }
    }

   
    /* 
    private void displayShortestPath(){
        System.out.println("Shortest distance from vertex "+ graph.getNode().get(start).getData() + ": ");
        for(int i =0; i < numVertices; i++){
            System.out.print(distance[i]);
            System.out.print(" > ");
            totaldistance+=distance[i];
        }

        System.out.println();
        System.out.println("The Total Distance:"+totaldistance);

    }
    */

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
