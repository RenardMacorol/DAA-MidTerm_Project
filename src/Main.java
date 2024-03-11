package src;

import javax.swing.*;

import src.AddressSearch.AddressSearchOption;
import src.CustomerDelivery.ShortestPath;
import src.CustomerDelivery.Tsp;
import src.Knapsack.KnapsackMain;
import src.SelectionSort.SelectionSort;

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
        //new Main();
        KnapsackMain knapsackMain = new KnapsackMain();
        SelectionSort selectionSort = new SelectionSort();
        Tsp tsp = new Tsp();
        AddressSearchOption addressSearchOption = new AddressSearchOption();
        
        
    }

}
