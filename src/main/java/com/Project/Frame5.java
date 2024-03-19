package com.Project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Frame5 extends JFrame implements ActionListener{

    Frame5(){
        // Panel for this
        JPanel guyPanel = new JPanel();
        guyPanel.setBounds(0, 0, 1000, 342);

        //Label in the top 
        ImageIcon wonder = new ImageIcon("src\\resources\\page5\\Wonder.png");
        JLabel guysIconLabel = new JLabel();
        guysIconLabel.setIcon(wonder);

        guyPanel.add(guysIconLabel);

        //
        JPanel guyName = new JPanel();
        guyName.setBounds(0, 342, 1000, 208);
        guyName.setBackground(Color.decode("#FDFDFD"));

        JFormattedTextField choose = new JFormattedTextField();
        choose.setPreferredSize(new Dimension(250,200));
        choose.setFont(new Font("Arial", Font.PLAIN, 50));
        choose.setForeground(Color.GRAY);
        choose.setBackground(Color.decode("#FDFDFD"));
        choose.setCaretColor(Color.decode("#242323"));
        choose.setText("##");
        choose.setBorder(null);

        guyName.add(choose);

        //Proceed button
        RoundedButton proceed = new RoundedButton("PROCEED", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 20);
        proceed.addActionListener(this);
        proceed.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Panel only one for this
        JPanel proceedBottom = new JPanel();
        proceedBottom.setBounds(0,550,1000,157);
        proceedBottom.setBackground(Color.decode("#FDFDFD"));
        
        //Import those componets in Panel
        proceedBottom.add(proceed);

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

       this.add(guyPanel);
       this.add(guyName);
       this.add(proceedBottom);

    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame6 frame6 = new Frame6();
    }
}