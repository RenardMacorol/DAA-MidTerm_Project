package src.GUI;
import java.awt.Color;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{

    public Frame(){
        
        //Frame settings
        this.setTitle("2BSCS-1 Miderm Project");
        this.setSize(1080,800);//Title of this not the whole program?
        this.setVisible(true); // sige i false moto yari ka sakin charutt
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); 
        //Background color
        //Note naka custom color ako dito guys kasi gusto ko NOTE!=Cream color yan 224,220,200
        this.getContentPane().setBackground(new Color(224,220,200));
        /*for logo 
        ImageIcon image = new ImageIcon("insert image");
        this.setIconImage(image.getImage());
        */
        
    }
    
        
        
}
