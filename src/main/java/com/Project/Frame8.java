package com.Project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Cursor;

public class Frame8 extends JFrame implements ActionListener {
    
    ImageIcon messageIcon;

    Frame8(String input, String string, int output) {

        JPanel journey = new JPanel();
        journey.setBounds(0, 0, 1000, 406);

        messageIcon = display(output);
        Image newImage = messageIcon.getImage();

        JLabel messageLabel = new JLabel();
        messageLabel.setIcon(new ImageIcon(newImage));

        journey.add(messageLabel);
        

        // shot output
        JPanel pathPanel = new JPanel();
        pathPanel.setBounds(0, 406, 1000, 181);
        pathPanel.setLayout(new GridLayout(4,0,0,5));
        pathPanel.setBackground(Color.decode("#FDFDFD"));

        JLabel shortPath = new JLabel("Shortest Route:");
        shortPath.setFont(new Font("DM SANS", Font.BOLD, 17));
        shortPath.setHorizontalAlignment(JLabel.CENTER);

        JLabel distance = new JLabel("Total Distance:");
        distance.setFont(new Font("DM SANS", Font.BOLD, 17));
        distance.setHorizontalAlignment(JLabel.CENTER);
    
        JLabel outputLabel = new JLabel();
        outputLabel.setText(input);
        outputLabel.setHorizontalAlignment(JLabel.CENTER);
        outputLabel.setFont(new Font("DM SANS", Font.PLAIN, 17));
      
        JLabel outputShortestLabel = new JLabel();
        outputShortestLabel.setText("Shortest Distance" + " " + string);
        outputShortestLabel.setFont(new Font("DM SANS", Font.PLAIN, 17));
        outputShortestLabel.setVerticalAlignment(JLabel.TOP);
        outputShortestLabel.setHorizontalAlignment(JLabel.CENTER);
        
        pathPanel.add(shortPath);
        pathPanel.add(outputLabel);
        pathPanel.add(distance);
        pathPanel.add(outputShortestLabel);


        JPanel invoiceBot = new JPanel();
        invoiceBot.setBounds(0,587,1000,120);
        invoiceBot.setBackground(Color.decode("#FDFDFD"));

        RoundedButton invoiceButton = new RoundedButton("GENERATE INVOICE", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 20);
        invoiceButton.addActionListener(this);
        invoiceButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        invoiceButton.addActionListener(this);

        invoiceBot.add(invoiceButton);
    
        //frame settings
       ImageIcon icon = new ImageIcon("src\\resources\\MainIcon.png");
       setIconImage(icon.getImage());
       setLayout(null);
       setTitle("This Guy Needs Some Attitude");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1000, 707);
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);
    
        this.add(journey);
        this.add(pathPanel);
        this.add(invoiceBot);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame10 frame10 = new Frame10();
    }

    private ImageIcon display(int output) {
        if (output == 0) {
            return new ImageIcon("src/resources/page8/Case _Tree House.png");
        }
        if (output == 1) {
            return new ImageIcon("src/resources/page8/Case _Candy Kingdom.png");
        }
        if (output == 2) {
            return new ImageIcon("src/resources/page8/Case _Farm World.png");
        }
        if (output == 3) {
            return new ImageIcon("src/resources/page8/Case _Ice Kingdom.png");
        }
        if (output == 4) {
            return new ImageIcon("src/resources/page8/Case _Beautopia.png");
        }
      
        return new ImageIcon();
    }
}