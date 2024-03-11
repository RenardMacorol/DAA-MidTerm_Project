package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import src.AddressSearch.AddressSearchOption;
import src.Knapsack.KnapsackMain;

import src.SelectionSort.SelectionSort;
import src.TSP.Tsp;

public class MainApp extends JFrame implements ActionListener {

    public MainApp() {
        JPanel startPanel = new JPanel();
        
        startPanel.setLayout(new BorderLayout());
        ImageIcon attitude = new ImageIcon("resources/attitude.png");
        
        JLabel attitudeIcon = new JLabel();
        attitudeIcon.setIcon(attitude);
        attitudeIcon.setPreferredSize(new Dimension(20, 20));
        attitudeIcon.setBounds(0,500 ,500,500);
        attitudeIcon.setVerticalAlignment(JLabel.CENTER);
        attitudeIcon.setHorizontalAlignment(JLabel.CENTER);
        
        JButton start = new JButton("Start");
        
        start.setBounds(425, 370, 100, 100);
        start.addActionListener(this);
        startPanel.add(start,BorderLayout.CENTER);
        /*
         * JButton knapSackButton = new JButton("Knapsack");
         * knapSackButton.setBounds(100,100,100,100);
         * JButton selectionSortButton = new JButton("Selection Sort");
         * selectionSortButton.setBounds(200,100,100,100);
         * JButton tspButton = new JButton("Delivery Address ");
         * tspButton.setBounds(300,100,100,100);
         * JButton addressSearchButton = new JButton("Search Address");
         * addressSearchButton.setBounds(400,100,100,100);
         * this.add(knapSackButton);
         * this.add(selectionSortButton);
         * this.add(tspButton);
         * this.add(addressSearchButton);
         */
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
        setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);
        startPanel.add(attitudeIcon,BorderLayout.CENTER);
        startPanel.setBounds(0, 0, 500, 500);
        this.add(startPanel);
        
        
        

    }

    public static void main(String[] args) {
        new MainApp();

        // KnapsackMain knapsackMain = new KnapsackMain();
        // SelectionSort selectionSort = new SelectionSort();
        // Tsp tsp = new Tsp();
        // AddressSearchOption addressSearchOption = new AddressSearchOption();

    }

    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame2 frame2 = new Frame2();
    }

}
