package src;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

import src.AddressSearch.AddressSearchOption;
import src.Knapsack.KnapsackMain;

import src.SelectionSort.SelectionSort;
import src.TSP.Tsp;

public class MainApp extends JFrame {

    public MainApp() {

        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 800);
        setBackground(Color.BLACK);
        setVisible(true);
        JButton knapSackButton = new JButton("Knapsack");
        knapSackButton.setBounds(100,100,100,100);
        JButton selectionSortButton = new JButton("Selection Sort");
        selectionSortButton.setBounds(200,100,100,100);
        JButton tspButton = new JButton("Delivery Address ");
        tspButton.setBounds(300,100,100,100);
        JButton addressSearchButton = new JButton("Search Address");
        addressSearchButton.setBounds(400,100,100,100);
        this.add(knapSackButton);
        this.add(selectionSortButton);
        this.add(tspButton);
        this.add(addressSearchButton);
        this.setLayout(new FlowLayout());
        

    }

    public static void main(String[] args) {
        //new MainApp();

        //KnapsackMain knapsackMain = new KnapsackMain();
        //SelectionSort selectionSort = new SelectionSort();
        Tsp tsp = new Tsp();
        //AddressSearchOption addressSearchOption = new AddressSearchOption();

    }

}
