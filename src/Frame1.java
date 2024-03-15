package src;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;

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
        RoundedButton start = new RoundedButton("START", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 20);
        start.addActionListener(this);
        start.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //add to the panel
        //startPanel.add(start,BorderLayout.CENTER);
        //startPanel.add(attitudeLabel,BorderLayout.CENTER);
        setTitle("This Guy Needs Some Attitude");

        //bottom panel
        JPanel startBot = new JPanel();
        startBot.setBounds(0, 550, 1000, 207);
        startBot.add(start);
        startBot.setBackground(Color.decode("#FDFDFD"));
       
        //frame again
        ImageIcon icon = new ImageIcon("resources/MainIcon.png");
        setIconImage(icon.getImage());
        setLayout(null);
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null);//center the window to screen when run
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
