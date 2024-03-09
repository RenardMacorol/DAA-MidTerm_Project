package TSPProtype;

import java.util.Arrays;

public class ShortestPath {
    public void shortestPath(Graph graph, int start){
        int numVertices = graph.getSize();
        int[] distance = new int[numVertices];
        boolean[] isVisited = new boolean[numVertices];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(isVisited, false);

        distance[start]=0;

        for(int i=0; i < numVertices-1;i++){
            int minVertex = findMinVertex(distance, isVisited);
            isVisited[minVertex] = true;

            for(int j= 0; j< numVertices;j++){
                if(graph.getMatrix()[minVertex][j]!=0 && !isVisited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDistance = distance[minVertex]+ graph.getMatrix()[minVertex][j];
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    }
                }
            }
        }

        System.out.println("Shortest distance from vertex "+ graph.getNode().get(start).getData() + ":");
        for(int i =0; i< numVertices; i++){
            System.out.println(graph.getNode().get(i).getData());
        }
       
    }
    
    private int findMinVertex(int[] distance, boolean[] isVisited){
        int minVertex = 0;
        for(int i=0; i < distance.length;i++){
            if(!isVisited[i]&&(minVertex==0)||distance[i]<distance[minVertex]){
                minVertex=i;
            }
        }
        return minVertex;
    }

}
