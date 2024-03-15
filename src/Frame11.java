package src;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame11 extends JFrame {
    Frame11() {
        ImageIcon thankyouIcon = new ImageIcon("resources\\Thank You.png");
        JLabel thankJLabel = new JLabel();
        thankJLabel.setIcon(thankyouIcon);
        

        // frame settings
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null);//center the window to screen when run
        setVisible(true);
        setResizable(false);
        this.add(thankJLabel);
        
    }
    
   
    

}
