package TSPProtype;


import java.util.Arrays;

public class Search {
    //Exaustice search 
    Search(int[][] graph, int start){
        int numVertices = graph.length;
        int[] distance = new int[numVertices];
        boolean[] isVisited = new boolean[numVertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(isVisited, false);

        distance[start] =0;
        
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
