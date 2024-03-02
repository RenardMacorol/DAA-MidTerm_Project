package TSPProtype;

import java.util.ArrayList;


public class Graph {
    private int[][] matrix;
    private ArrayList<Node> nodes;
    private int size;
   

    Graph(int size) {
        this.size = size;
        setArrayList();
        setMatrix(size);
    }

    public void setMatrix(int size) {
        matrix = new int[size][size];
    }

    public void setArrayList() {
        nodes = new ArrayList<>();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public ArrayList<Node> getNode() {
        return nodes;
    }

    public int getSize() {
        return size;
    }

    // Functions for adding Nodes and edge of the Graph
    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination, int distance) {
        matrix[source][destination] = distance;
    }

    // Print statement for debugging and refference purposes
    public void print() {
        StringBuilder str = new StringBuilder();
        str.append("           ");
        for (Node nodes : nodes) {
            str.append(String.format("%7s ", nodes.getData()));
        }
        str.append("\n");
        for (int i = 0; i < matrix.length; i++) {
            str.append(String.format("%-10s", nodes.get(i).getData()));
            for (int j = 0; j < matrix[i].length; j++) {
                str.append(String.format("\t%-2d", matrix[i][j]));
            }
            str.append("\n");
        }
        System.out.println(str);
    }

    
}
