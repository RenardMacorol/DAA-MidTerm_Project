package TSPProtype;

import java.util.ArrayList;

public class Graph {
    int[][] matrix;
    ArrayList<Node> nodes;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination, int distance) {
        matrix[source][destination] = distance;
    }

    public void print() {
        StringBuilder s = new StringBuilder();
        s.append("           ");
        for (Node nodes : nodes) {
            s.append(String.format("%7s ", nodes.data));
        }
        s.append("\n");
        for (int i = 0; i < matrix.length; i++) {
            s.append(String.format("%-10s", nodes.get(i).data));
            for (int j = 0; j < matrix[i].length; j++) {
                s.append(String.format("\t%-2d", matrix[i][j]));
            }
            s.append("\n");
        }
        System.out.println(s);
    }
}
