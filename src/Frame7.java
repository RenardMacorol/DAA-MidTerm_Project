package src;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        ImageIcon candyKingdomIcon = new ImageIcon();
        ImageIcon farmWorldIcon = new ImageIcon();
        ImageIcon treeHouseIcon = new ImageIcon();
        ImageIcon iceKingdomIcon = new ImageIcon();
        ImageIcon beutopiaIcon = new ImageIcon();
        this.candyKingdomButton = new JButton("Candy Kingdom");
        this.farmWorldButton = new JButton("Farm World");
        this.treeHouseButton = new JButton("Tree House");
        this.iceKinggdomButton = new JButton("Ice King");
        this.beutopiaButton = new JButton("Beutopia");
        
        candyKingdomButton.addActionListener(this);
        farmWorldButton.addActionListener(this);
        treeHouseButton.addActionListener(this);
        iceKinggdomButton.addActionListener(this);
        beutopiaButton.addActionListener(this);

        buttonsLabel.add(candyKingdomButton);
        buttonsLabel.add(farmWorldButton);
        buttonsLabel.add(treeHouseButton);
        buttonsLabel.add(iceKinggdomButton);
        buttonsLabel.add(beutopiaButton);
        // all components
        locationPanel.add(messageLabel);
        locationPanel.add(buttonsLabel);

        // frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
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
