package src;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame11 extends JFrame {
    Frame11() {
        ImageIcon thankyouIcon = new ImageIcon("resources\\Last Page TY.png");
        JLabel thankJLabel = new JLabel();
        thankJLabel.setBackground(Color.decode("#FDFDFD"));

        thankJLabel.setBounds(0, 20, 1000, 500);
        
        thankJLabel.setIcon(thankyouIcon);
        

        // frame settings
       ImageIcon icon = new ImageIcon("resources/MainIcon.png");
       setIconImage(icon.getImage());
       setLayout(null);
       setTitle("This Guy Needs Some Attitude");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1000, 707);
       setVisible(true);
       setBackground(Color.WHITE);
       setResizable(false);
       setLocationRelativeTo(null);
       this.add(thankJLabel);
        
    }
    
   
    

}
