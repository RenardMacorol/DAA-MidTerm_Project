package CustomerDelivery;


public class Graph {
    private int[][] matrix;
    
    private int size;
   

    Graph(int size) {
        this.size = size;
        setMatrix(size);
    }

    public void setMatrix(int size) {
        matrix = new int[size][size];
    }

   

    public int[][] getMatrix() {
        return matrix;
    }

   
    public int getSize() {
        return size;
    }

    // Functions for adding Nodes and edge of the Graph

    public void addEdge(int source, int destination, int distance) {
        matrix[source][destination] = distance;
    }

    // Print statement for debugging and refference purposes
   

    
}
