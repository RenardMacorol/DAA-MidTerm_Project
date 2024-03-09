package src.CustomerDelivery;

public class Node {
    private String location;

    Node(String location) {

        this.location = location;
    }

    public void setData(String data) {
        this.location = data;
    }

    public String getData() {
        return location;
    }

}
