package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import src.TSP.Tsp;

public class Frame7 extends JFrame implements ActionListener {
    JButton candyKingdomButton, farmWorldButton, treeHouseButton, iceKinggdomButton,beutopiaButton;
    Tsp tsp;
    Frame7() {
        // panel itself
        JPanel locationPanel = new JPanel();
        locationPanel.setLayout(new GridLayout(2, 0));
        locationPanel.setBounds(0, 0, 500, 500);

        // top image/msg
        ImageIcon messageIcon = new ImageIcon();
        JLabel messageLabel = new JLabel("Message here");
        messageLabel.setIcon(messageIcon);
        messageLabel.setPreferredSize(new Dimension(20, 20));
        messageLabel.setBounds(0, 500, 500, 500);
        messageLabel.setVerticalAlignment(JLabel.CENTER);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        // All buttons locations should be here
        JLabel buttonsLabel = new JLabel();
        buttonsLabel.setLayout(new FlowLayout());

        ImageIcon candyKingdomIcon = new ImageIcon("resources/page7/candy-kingdom_button.png");
        ImageIcon farmWorldIcon = new ImageIcon("resources/page7/farm-world_button.png");
        ImageIcon treeHouseIcon = new ImageIcon("resources/page7/tree-house_button.png");
        ImageIcon iceKingdomIcon = new ImageIcon("resources/page7/ice-kingdom_button.png");
        ImageIcon beutopiaIcon = new ImageIcon("resources/page7/beautopia_button.png");
        this.treeHouseButton = new JButton(treeHouseIcon);
        treeHouseButton.setContentAreaFilled(false);
        treeHouseButton.setBorderPainted(false);;
        this.candyKingdomButton = new JButton(candyKingdomIcon);
        candyKingdomButton.setContentAreaFilled(false);
        candyKingdomButton.setBorderPainted(false);;
        this.farmWorldButton = new JButton(farmWorldIcon); 
        farmWorldButton.setContentAreaFilled(false);
        farmWorldButton.setBorderPainted(false);;       
        this.iceKinggdomButton = new JButton(iceKingdomIcon);
        iceKinggdomButton.setContentAreaFilled(false);
        iceKinggdomButton.setBorderPainted(false);;
        this.beutopiaButton = new JButton(beutopiaIcon);
        beutopiaButton.setContentAreaFilled(false);
        beutopiaButton.setBorderPainted(false);;
        
        treeHouseButton.addActionListener(this);
        candyKingdomButton.addActionListener(this);
        farmWorldButton.addActionListener(this);
        iceKinggdomButton.addActionListener(this);
        beutopiaButton.addActionListener(this);

        buttonsLabel.add(treeHouseButton);
        buttonsLabel.add(farmWorldButton);
        buttonsLabel.add(candyKingdomButton);
        buttonsLabel.add(iceKinggdomButton);
        buttonsLabel.add(beutopiaButton);
        // all components
        locationPanel.add(messageLabel);
        locationPanel.add(buttonsLabel);

        // frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        setBackground(Color.WHITE);
       
        setVisible(true);
        setResizable(false);
        this.add(locationPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==treeHouseButton){
           tsp = new Tsp(0);
        }
        if(e.getSource()==candyKingdomButton){
            tsp = new Tsp(1);
        }
        if(e.getSource()==farmWorldButton){
            tsp = new Tsp(2);
        }
        if(e.getSource()==iceKinggdomButton){
            tsp = new Tsp(3);
        }
        if(e.getSource()==beutopiaButton){
            tsp = new Tsp(4);
        }

        Frame8 frame8 = new Frame8(tsp.getOuput(),tsp.getShortestDistance());
    }
}
