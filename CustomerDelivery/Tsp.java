package CustomerDelivery;


import java.util.Map;

public class Tsp{
    public Tsp(){
        Graph graph = new Graph(4);

       // graph.addNode(new Node("St.Peter"));
        //graph.addNode(new Node("St.John"));
        //graph.addNode(new Node("Lanao"));
        //graph.addNode(new Node("Maguindanao"));
        String[] locations = {"St.Peter","St.John","Lanao","Maguinadanao"};
        String startLocation = "St.John";
         
        /* */
        graph.addEdge(0, 1, 300);
        graph.addEdge(0, 2, 150);
        graph.addEdge(0, 3, 200);

        graph.addEdge(1, 0, 150);
        graph.addEdge(1, 2, 200);
        graph.addEdge(1, 3, 300);

        graph.addEdge(2, 0, 100);
        graph.addEdge(2, 1, 120);
        graph.addEdge(2, 3, 200);

        graph.addEdge(3, 0, 200);
        graph.addEdge(3, 1, 200);
        graph.addEdge(3, 2, 100);
        
    
        ShortestPath s = new ShortestPath();
        int totalValue = 0;
        Map<String,Integer> shortestDistance = s.shortestPath(graph.getMatrix(),locations,startLocation);
        System.out.println("Shortest Distance from "+ startLocation + ":");
        for(Map.Entry<String, Integer> entry : shortestDistance.entrySet()){
            System.out.println(" To " + entry.getKey() + " : " + entry.getValue());
            totalValue+=entry.getValue();
        }
        System.out.println("Total Value: "+ totalValue);
         
        
    }
    
}