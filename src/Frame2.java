package src;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame2 extends JFrame implements ActionListener{
    Frame2(){
        JButton botton = new JButton();
        botton.setText("Dont Click");
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
        this.add(botton);
        botton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }


   
    
    

   

    
}
