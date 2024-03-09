package src;

import javax.swing.*;

public class Main extends JFrame {
    private JLabel Welcome;
    private JPanel MainPanel;
    private JButton selectionSortButton;
    private JButton addressSearchButton;
    private JButton customerDeliveryButton;
    private JButton knapsackButton;

    public Main(){
        setContentPane(MainPanel);
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
