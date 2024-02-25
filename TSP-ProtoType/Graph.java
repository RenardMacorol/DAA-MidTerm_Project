import java.util.ArrayList;

public class Graph {
    int[][] dataMatrix;
    ArrayList<Node> nodes;
    

    Graph(int size) {
        nodes = new ArrayList<>();
        dataMatrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination, int value) {
        dataMatrix[source][destination] = value;
    }

    public boolean checkEdge(int source, int destination) {
        if (dataMatrix[source][destination] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
       
        for (int i = 0; i < dataMatrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < dataMatrix[i].length; j++) {
                System.out.print(dataMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}