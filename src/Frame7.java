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
    JButton candyKingdomButton, farmWorldButton, treeHouseButton, iceKinggdomButton, beutopiaButton;
    Tsp tsp;
    Frame8 outPutFrame;

    Frame7() {
        // panel itself
        JPanel locationPanel = new JPanel();
        locationPanel.setLayout(new GridLayout(2,0));
        locationPanel.setBackground(Color.WHITE);

        // top image/msg
        ImageIcon messageIcon = new ImageIcon("resources/page7/1panel_static.png");
        Image newImage = messageIcon.getImage();
        Image resized = newImage.getScaledInstance(1000, 350, java.awt.Image.SCALE_SMOOTH);
        JLabel messageLabel = new JLabel();
        messageLabel.setIcon(new ImageIcon(resized));

        // All buttons locations should be here
        JLabel buttonsLabel = new JLabel();
        buttonsLabel.setLayout(new FlowLayout());
        int buttonSize = 150;
        ImageIcon candyKingdom = new ImageIcon("resources/page7/candy-kingdom_button.png");
        Image candyIcon = candyKingdom.getImage();
        Image candyResized = candyIcon.getScaledInstance(buttonSize, buttonSize, java.awt.Image.SCALE_SMOOTH);
        ImageIcon farmWorld = new ImageIcon("resources/page7/farm-world_button.png");
        Image farmIcon = farmWorld.getImage();
        Image farmResized = farmIcon.getScaledInstance(buttonSize, buttonSize, java.awt.Image.SCALE_SMOOTH);
        ImageIcon treeHouse = new ImageIcon("resources/page7/tree-house_button.png");
        Image treeIcon = treeHouse.getImage();
        Image treeResize = treeIcon.getScaledInstance(buttonSize, buttonSize, java.awt.Image.SCALE_SMOOTH);
        ImageIcon iceKingdom = new ImageIcon("resources/page7/ice-kingdom_button.png");
        Image iceIcon = iceKingdom.getImage();
        Image iceResize = iceIcon.getScaledInstance(buttonSize, buttonSize, java.awt.Image.SCALE_SMOOTH);
        ImageIcon beutopia = new ImageIcon("resources/page7/beautopia_button.png");
        Image beuIcon = beutopia.getImage();
        Image beuResize = beuIcon.getScaledInstance(buttonSize, buttonSize, java.awt.Image.SCALE_SMOOTH);
        this.treeHouseButton = new JButton(new ImageIcon(treeResize));
        treeHouseButton.setContentAreaFilled(false);
        treeHouseButton.setBorderPainted(false);
        ;
        this.candyKingdomButton = new JButton(new ImageIcon(candyResized));
        candyKingdomButton.setContentAreaFilled(false);
        candyKingdomButton.setBorderPainted(false);
        ;
        this.farmWorldButton = new JButton(new ImageIcon(farmResized));
        farmWorldButton.setContentAreaFilled(false);
        farmWorldButton.setBorderPainted(false);
        ;
        this.iceKinggdomButton = new JButton(new ImageIcon(iceResize));
        iceKinggdomButton.setContentAreaFilled(false);
        iceKinggdomButton.setBorderPainted(false);
        ;
        this.beutopiaButton = new JButton(new ImageIcon(beuResize));
        beutopiaButton.setContentAreaFilled(false);
        beutopiaButton.setBorderPainted(false);
        ;

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
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null);//center the window to screen when run
        setVisible(true);
        setResizable(false);
        this.add(locationPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == treeHouseButton) {
            tsp = new Tsp(0);
            new Frame8(tsp.getOuput(), tsp.getOutputDistance(),0);
        }
        if (e.getSource() == candyKingdomButton) {
            tsp = new Tsp(1);
            new Frame8(tsp.getOuput(), tsp.getOutputDistance(),1);
        }
        if (e.getSource() == farmWorldButton) {
            tsp = new Tsp(2);
            new Frame8(tsp.getOuput(), tsp.getOutputDistance(),2);
        }
        if (e.getSource() == iceKinggdomButton) {
            tsp = new Tsp(3);
            new Frame8(tsp.getOuput(), tsp.getOutputDistance(),3);
        }
        if (e.getSource() == beutopiaButton) {
            tsp = new Tsp(4);
            new Frame8(tsp.getOuput(), tsp.getOutputDistance(),4);
        }

        
    }
    
    public static void main(String[] args) {
        Frame7 frame = new Frame7();
    }
}
