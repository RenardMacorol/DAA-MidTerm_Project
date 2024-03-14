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

public class Frame1 extends JFrame implements ActionListener {

    public Frame1() {
        //Di malinis code ko dine yawa basta nasa iisang panel lang sya
        JPanel startPanel = new JPanel();
        startPanel.setLayout(new BorderLayout());
        startPanel.setBounds(0, 0, 500, 500);

        //Image 
        ImageIcon attitudeIcon = new ImageIcon("resources/attitude_icon.png");
        JLabel attitudeLabel = new JLabel();
        attitudeLabel.setIcon(attitudeIcon);
        attitudeLabel.setPreferredSize(new Dimension(20, 20));
        attitudeLabel.setBounds(0,500 ,500,500);
        attitudeLabel.setVerticalAlignment(JLabel.CENTER);
        attitudeLabel.setHorizontalAlignment(JLabel.CENTER);
        
        //Only one button only one yieee
        JButton start = new JButton("Start");
        start.setBounds(425, 370, 100, 100);
        start.addActionListener(this);
        
        //add to the panel
        startPanel.add(start,BorderLayout.CENTER);
        startPanel.add(attitudeLabel,BorderLayout.CENTER);
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
        setVisible(true);
        setResizable(false);
        //add into the frame
        this.add(startPanel);
        
        
        

    }


    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame2 frame2 = new Frame2();
    }

}
