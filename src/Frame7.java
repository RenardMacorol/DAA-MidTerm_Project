package src;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JPanel places = new JPanel();
        places.setBounds(0,0,1000,490);

        ImageIcon map = new ImageIcon("resources/page7/places.png");
        JLabel across = new JLabel();
        across.setIcon(map);

        places.add(across);

        JPanel point= new JPanel();
        point.setLayout(new FlowLayout());
        point.setBounds(0,490,1000,217);
        point.setBackground(Color.decode("#FDFDFD"));

        ImageIcon candyKingdom = new ImageIcon("resources/page7/candy-kingdom_button.png");
        this.candyKingdomButton = new JButton();
        this.candyKingdomButton.setIcon(candyKingdom);
        this.candyKingdomButton.setBorder(null);
        this.candyKingdomButton.setFocusable(false);
        this.candyKingdomButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ImageIcon farmWorld = new ImageIcon("resources/page7/farm-world_button.png");
        this.farmWorldButton = new JButton();
        this.farmWorldButton.setIcon(farmWorld);
        this.farmWorldButton.setBorder(null);
        this.farmWorldButton.setFocusable(false);
        this.farmWorldButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ImageIcon treeHouse = new ImageIcon("resources/page7/tree-house_button.png");
        this.treeHouseButton = new JButton();
        this.treeHouseButton.setIcon(treeHouse);
        this.treeHouseButton.setBorder(null);
        this.treeHouseButton.setFocusable(false);
        this.treeHouseButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ImageIcon iceKingdom = new ImageIcon("resources/page7/ice-kingdom_button.png");
        this.iceKinggdomButton = new JButton();
        this.iceKinggdomButton.setIcon(iceKingdom);
        this.iceKinggdomButton.setBorder(null);
        this.iceKinggdomButton.setFocusable(false);
        this.iceKinggdomButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ImageIcon beautopia = new ImageIcon("resources/page7/beautopia_button.png");
        this.beutopiaButton = new JButton();
        this.beutopiaButton.setIcon(beautopia);
        this.beutopiaButton.setBorder(null);
        this.beutopiaButton.setFocusable(false);
        this.beutopiaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        treeHouseButton.addActionListener(this);
        candyKingdomButton.addActionListener(this);
        farmWorldButton.addActionListener(this);
        iceKinggdomButton.addActionListener(this);
        beutopiaButton.addActionListener(this);

        point.add(candyKingdomButton);
        point.add(farmWorldButton);
        point.add(treeHouseButton);
        point.add(iceKinggdomButton);
        point.add(beutopiaButton);
       
        this.add(places);
        this.add(point);

        // frame settings
       ImageIcon icon = new ImageIcon("resources/MainIcon.png");
       setIconImage(icon.getImage());
       setLayout(null);
       setTitle("This Guy Needs Some Attitude");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1000, 707);
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);
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
}
