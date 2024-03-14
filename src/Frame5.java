package src;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame5 extends JFrame implements ActionListener{

    Frame5(){
        // Panel for this
        JPanel guyPanel = new JPanel();
        guyPanel.setLayout(new GridLayout(3,0));
        guyPanel.setBounds(0, 0, 500, 500);

        //Label in the top 
        ImageIcon guyIcon = new ImageIcon();
        JLabel guysIconLabel = new JLabel("Name this nigga");
        guysIconLabel.setIcon(guyIcon);
        guysIconLabel.setVerticalAlignment(JLabel.CENTER);
        guysIconLabel.setHorizontalAlignment(JLabel.CENTER);

        //input label
        JLabel guyInput = new JLabel("Guy");
        guyInput.setVerticalAlignment(JLabel.CENTER);
        guyInput.setHorizontalAlignment(JLabel.CENTER);

        JButton proceed = new JButton("Proceed");
        proceed.setBounds(425, 370, 100, 100);
        proceed.addActionListener(this);

        //import all components
        guyPanel.add(guysIconLabel);
        guyPanel.add(guyInput);
        guyPanel.add(proceed);

        //frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
        setVisible(true);
        setResizable(false);
        this.add(guyPanel);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame6 frame6 = new Frame6();
    }
}
