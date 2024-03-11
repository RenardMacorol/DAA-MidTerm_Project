package src.CustomerDelivery;

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
    public void print(String[] locations) {
        StringBuilder s = new StringBuilder();
        s.append("           ");
        StringBuilder str = new StringBuilder();
        str.append("           ");
        for(int i=0; i<locations.length;i++){
            s.append(String.format("%7s ", locations[i]));
            str.append(String.format("%7s ", locations[i]));
        }
        
        s.append("\n");
        str.append("\n");
        for (int i = 0; i < matrix.length; i++) {
            s.append(String.format("%-10s", locations[i]));
            str.append(String.format("%-10s", locations[i]));
            for (int j = 0; j < matrix[i].length; j++) {
                s.append(String.format("\t%-2d", matrix[i][j]));
                str.append(String.format("\t%-2d", matrix[i][j]));
            }
            s.append("\n");
            str.append("\n");
        }
        System.out.println(s);
        //System.out.println(str);
    }
}
