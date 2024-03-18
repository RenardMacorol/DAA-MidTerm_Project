package src;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame10 extends JFrame implements ActionListener {
    JButton yes,rest;
    Frame10() {
        JPanel ratingPanel = new JPanel();
        ratingPanel.setLayout(new GridLayout(4, 0));
        ratingPanel.setBounds(0, 0, 500, 500);

        // Upper area
        JLabel topMessage = new JLabel();
        topMessage.setLayout(new FlowLayout());
        topMessage.setVerticalAlignment(JLabel.CENTER);
        topMessage.setHorizontalAlignment(JLabel.CENTER);
        ImageIcon guyIcon = new ImageIcon();
        JLabel guyLabel = new JLabel("May Icon dito eh");
        guyLabel.setVerticalAlignment(JLabel.CENTER);
        guyLabel.setHorizontalAlignment(JLabel.CENTER);
        guyLabel.setIcon(guyIcon);
        JLabel congratsMesLabel = new JLabel("Congrats");
        congratsMesLabel.setVerticalAlignment(JLabel.CENTER);
        congratsMesLabel.setHorizontalAlignment(JLabel.CENTER);
        topMessage.add(guyLabel);
        topMessage.add(congratsMesLabel);

       
        ImageIcon guyIcon5 = new ImageIcon("resources/page10/guy-5star.png");
        ImageIcon guyIcon4 = new ImageIcon("resources/page10/guy-4star.png");
        ImageIcon guyIcon3 = new ImageIcon("resources/page10/guy-3star.png");
        ImageIcon guyIcon2 = new ImageIcon("resources/page10/guy-2star.png");
        ImageIcon guyIcon1 = new ImageIcon("resources/page10/guy-1star.png");

        JLabel guyLabel5 = new JLabel(guyIcon5);
        JLabel guyLabel4 = new JLabel(guyIcon4);
        JLabel guyLabel3 = new JLabel(guyIcon3);
        JLabel guyLabel2 = new JLabel(guyIcon2);
        JLabel guyLabel1 = new JLabel(guyIcon1);
       
        guyPanel.add(guyLabel5);
        guyPanel.add(guyLabel4);
        guyPanel.add(guyLabel3);
        guyPanel.add(guyLabel2);
        guyPanel.add(guyLabel1);

        // Componets
        ratingPanel.add(topMessage);
        ratingPanel.add(ratingLable);
        ratingPanel.add(questionLabel);
        ratingPanel.add(optionLabel);

        // Panel 2 - rate 'to
        JPanel ratePanel = new JPanel();
        ratePanel.setBounds(0, 315, 1000, 110);
        ratePanel.setBackground(Color.decode("#FDFDFD"));


        ImageIcon rateIcon5 = new ImageIcon("resources/page10/5star-rate.png");
        ImageIcon rateIcon4 = new ImageIcon("resources/page10/4star-rate.png");
        ImageIcon rateIcon3 = new ImageIcon("resources/page10/3star-rate.png");
        ImageIcon rateIcon2 = new ImageIcon("resources/page10/2star-rate.png");
        ImageIcon rateIcon1 = new ImageIcon("resources/page10/1star-rate.png");

        JLabel rateLabel5 = new JLabel(rateIcon5);
        JLabel rateLabel4 = new JLabel(rateIcon4);
        JLabel rateLabel3 = new JLabel(rateIcon3);
        JLabel rateLabel2 = new JLabel(rateIcon2);
        JLabel rateLabel1 = new JLabel(rateIcon1);

        ratePanel.add(rateLabel5);
        ratePanel.add(rateLabel4);
        ratePanel.add(rateLabel3);
        ratePanel.add(rateLabel2);
        ratePanel.add(rateLabel1);


        // Panel 3 - question 
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
        setVisible(true);
        setResizable(false);
        this.add(ratingPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource()==yes) {
            Frame1 frame = new Frame1();
        }else{
            Frame11 frame11 = new Frame11();
        }
        
    }
    
}
