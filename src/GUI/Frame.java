package src.GUI;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame {
    JFrame frame;
    JButton aboutButton;
    public Frame(){
        frame = new JFrame("ERE");
        
        aboutButton = new JButton("About Us They/Them wbahhaha");
        //frame settings
        frame.setSize(1080,800);
        frame.setVisible(true); // sige i false moto yari ka sakin charutt
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Butones settings
        aboutButton.setBounds(100,100,100,100);
        //Add elements
        frame.add(aboutButton);
    }
    
        
        
}
