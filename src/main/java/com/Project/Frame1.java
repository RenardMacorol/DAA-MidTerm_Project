package com.Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame1 extends JFrame implements ActionListener {

    public Frame1() {
        

        // Image
        ImageIcon attitudeIcon = new ImageIcon("resources/page1/Title.png");

        JLabel title = new JLabel();
        title.setIcon(attitudeIcon);

        // Di malinis code ko dine yawa basta nasa iisang panel lang sya
        JPanel startPanel = new JPanel();
        startPanel.setBounds(0, 0, 1000, 550);
        
        // add to the panel
        startPanel.add(title);

        // Only one button only one yieee
        RoundedButton start = new RoundedButton("START", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 20);
        start.addActionListener(this);

        //bottom panel
        JPanel startBot = new JPanel();
        startBot.setBounds(0, 550, 1000, 207);
        startBot.add(start);
        startBot.setBackground(Color.WHITE);
       
        //frame again
        ImageIcon icon = new ImageIcon("resources/MainIcon.png");
        setIconImage(icon.getImage());
        setLayout(null);
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // add into the frame
        this.add(startPanel);
        this.add(startBot);

    }

    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame2 frame2 = new Frame2();
    }

}
