package CustomerDelivery;

public class Tsp{
    public Tsp(){
        Graph graph = new Graph(4);

        graph.addNode(new Node("St.Peter"));
        graph.addNode(new Node("St.John"));
        graph.addNode(new Node("Lanao"));
        graph.addNode(new Node("Maguindanao"));

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

        graph.print();

        ShortestPath s = new ShortestPath();
        s.shortestPath(graph, 0);
    }
    
}