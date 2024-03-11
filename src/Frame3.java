package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Frame3 extends Frame2 implements ActionListener{
    Frame3(){

    }

    

    
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame4 frame4 = new Frame4();
        
    }
}