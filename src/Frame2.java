package src;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame2 extends JFrame implements ActionListener{
    Frame2(){
        //Panel only one for this
        JPanel proceedPanel = new JPanel();
        proceedPanel.setLayout(new BorderLayout());
        proceedPanel.setBounds(0,0,500,500);

        //Image UI itself
        ImageIcon messageIcon = new ImageIcon();
        JLabel messageLabel = new JLabel("404");
        messageLabel.setIcon(messageIcon);
        messageLabel.setPreferredSize(new Dimension(20, 20));
        messageLabel.setBounds(0,500,500,500);
        messageLabel.setVerticalAlignment(JLabel.CENTER);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        //Proceed button
        JButton proceed = new JButton("Proceed");
        proceed.setBounds(425, 370, 100, 100);
        proceed.addActionListener(this);

        //Import those componets in Panel
        proceedPanel.add(proceed,BorderLayout.CENTER);
        proceedPanel.add(messageLabel,BorderLayout.CENTER);
        //Frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        setVisible(true);
        setResizable(false);
        //add int the frame
        this.add(proceedPanel);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame3 frame3 = new Frame3();
    }


   
    
    

   

    
}
