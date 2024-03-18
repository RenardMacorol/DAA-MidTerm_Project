package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Cursor;

public class Frame2 extends JFrame implements ActionListener{
    Frame2(){
        //Panel only for this
        JPanel proceedPanel = new JPanel();
        proceedPanel.setBounds(0,0,1000,550);

        //Image UI itself
        ImageIcon messageIcon = new ImageIcon("resources/page2/Choices.png");
        JLabel messageLabel = new JLabel();
        messageLabel.setIcon(messageIcon);

        //Import those componets in Panel
        proceedPanel.add(messageLabel);

        //Proceed button
        RoundedButton proceed = new RoundedButton("PROCEED", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 20);
        proceed.addActionListener(this);

        //Panel only one for this
        JPanel proceedBottom = new JPanel();
        proceedBottom.setBounds(0,550,1000,157);
        proceedBottom.setBackground(Color.WHITE);
        
        //Import those componets in Panel
        proceedBottom.add(proceed);
       
        //Frame again
       ImageIcon icon = new ImageIcon("resources/MainIcon.png");
       setIconImage(icon.getImage());
       setLayout(null);
       setTitle("This Guy Needs Some Attitude");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1000, 707);
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);

        //add int the frame
        this.add(proceedPanel);
        this.add(proceedBottom);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame3 frame3 = new Frame3();
    }


   
    
    

   

    
}
