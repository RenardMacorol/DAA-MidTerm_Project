package src;

import java.awt.Color;

import java.awt.Dimension;
=======
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame10 extends JFrame implements ActionListener {
    private JButton yes, rest;

    public Frame10() {
        // Panel 1 - guy
        JPanel guyPanel = new JPanel();
        guyPanel.setBounds(0, -10, 1000, 346);
        guyPanel.setBackground(Color.decode("#FDFDFD"));

        
        ImageIcon guyIcon = new ImageIcon("resources/page10/guy-5star.png");

        JLabel guyLabel = new JLabel(guyIcon);
        guyPanel.add(guyLabel);


        // Panel 2 - rate 'to
        JPanel ratePanel = new JPanel();
        ratePanel.setBounds(0, 315, 1000, 110);
        ratePanel.setBackground(Color.decode("#FDFDFD"));


        ImageIcon rateIcon = new ImageIcon("resources/page10/5star-rate.png");
        JLabel rateLabel = new JLabel(rateIcon);
        ratePanel.add(rateLabel);


        // Panel 3 - question hays
        JPanel questionPanel = new JPanel();
        questionPanel.setBounds(0, 426, 1000, 137);
        questionPanel.setBackground(Color.decode("#FDFDFD"));

        ImageIcon questionIcon = new ImageIcon("resources/page10/3panel_static.png");

        JLabel questionLabel = new JLabel(questionIcon);
        questionPanel.add(questionLabel);

        // Panel 4 - button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(0, 553, 1000, 114);
        buttonPanel.setBackground(Color.decode("#FDFDFD"));

        // Button - RoundedButton implementation
        RoundedButton yesButton = new RoundedButton("YES", Color.decode("#242323"), Color.WHITE, 30, 0, 0, "Arial", 22);
        yesButton.addActionListener(this);
        buttonPanel.add(yesButton);

        JLabel orLabel = new JLabel(new ImageIcon("resources/page10/4panel-or_static.png"));
        buttonPanel.add(orLabel);

        RoundedButton restButton = new RoundedButton("REST", Color.decode("#242323"), Color.WHITE, 30, 0, 0, "Arial", 22);
        restButton.addActionListener(this);
        buttonPanel.add(restButton);

        // Add components to frame
        setLayout(null); // Use null layout
        add(guyPanel);
        add(ratePanel);
        add(questionPanel);
        add(buttonPanel);

        // Frame settings

        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources/AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null); // Center the window to screen when run
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("YES")) {
            dispose();
            Frame1 frame1 = new Frame1(); // Open new frame
        } else if (e.getActionCommand().equals("REST")) {
            dispose();
            Frame11 frame11 = new Frame11(); // Open new frame
        }
    }
    
}
