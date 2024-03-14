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

public class Frame7 extends JFrame implements ActionListener{
    Frame7() {
        //panel itself
        JPanel locationPanel = new JPanel();
        locationPanel.setLayout(new GridLayout(2,0));
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
        JButton candyKingdomButton = new JButton("Candy Kingdom");
        JButton farmWorldButton = new JButton("FarmWorld");
        JButton treeHouseButton = new JButton("Beutopia");
        JButton iceKinggdomButton = new JButton("Ice Kingdom");
        candyKingdomButton.addActionListener(this);
        farmWorldButton.addActionListener(this);
        treeHouseButton.addActionListener(this);
        iceKinggdomButton.addActionListener(this);

        buttonsLabel.add(candyKingdomButton);
        buttonsLabel.add(farmWorldButton);
        buttonsLabel.add(treeHouseButton);
        buttonsLabel.add(iceKinggdomButton);

        //all components
        locationPanel.add(messageLabel);
        locationPanel.add(buttonsLabel);

        //frame settings
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
        Frame8 frame8 = new Frame8();
    }
}
