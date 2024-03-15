package src;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame3 extends JFrame implements ActionListener {
    Frame3() {
        // Panel for this
        JPanel knapsackInputPanel = new JPanel();
        knapsackInputPanel.setLayout(new GridLayout(4, 0));
        knapsackInputPanel.setBounds(0, 0, 500, 500);
        
        //Label in the top
        ImageIcon butWaitIcon = new ImageIcon();
        JLabel butWaitLabel = new JLabel("But wait");
        butWaitLabel.setIcon(butWaitIcon);
        butWaitLabel.setPreferredSize(new Dimension(20,20));
        butWaitLabel.setBounds(0,0,500,500);
        butWaitLabel.setVerticalAlignment(JLabel.CENTER);
        butWaitLabel.setHorizontalAlignment(JLabel.CENTER);

        //Dislplay all Table
        JLabel table = new JLabel("May table dito");
        table.setPreferredSize(new Dimension(20,20));
        table.setBounds(0, 0, 500, 500);
        table.setVerticalAlignment(JLabel.CENTER);
        table.setHorizontalAlignment(JLabel.CENTER);
        //Enter your heart capacity with inputField
        JLabel input = new JLabel("Enter your heart capacity : My input field dine");
        input.setPreferredSize(new Dimension(20,20));
        input.setBounds(0,0,500,500);
        input.setVerticalAlignment(JLabel.CENTER);
        input.setHorizontalAlignment(JLabel.CENTER);
        //See result Button
        JButton seeResult = new JButton("See Result");
        seeResult.setBounds(425, 370, 100, 100);
        seeResult.addActionListener(this);

        //Import all components
        knapsackInputPanel.add(butWaitLabel);
        knapsackInputPanel.add(table);
        knapsackInputPanel.add(input);
        knapsackInputPanel.add(seeResult);
        
        //frame settings
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null);//center the window to screen when run
        setSize(1000, 707);
        setVisible(true);
        setResizable(false);
        this.add(knapsackInputPanel);
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame4 frame4 = new Frame4();

    }
}