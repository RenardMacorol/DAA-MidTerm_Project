package src;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame10 extends JFrame implements ActionListener {
    JButton yes,rest;
    Frame10() {
        JPanel ratingPanel = new JPanel();
        ratingPanel.setLayout(new GridLayout(4, 0));
        ratingPanel.setBounds(0, 0, 500, 500);

        // Upper area
        JLabel topMessage = new JLabel();
        topMessage.setLayout(new FlowLayout());
        topMessage.setVerticalAlignment(JLabel.CENTER);
        topMessage.setHorizontalAlignment(JLabel.CENTER);
        ImageIcon guyIcon = new ImageIcon();
        JLabel guyLabel = new JLabel("May Icon dito eh");
        guyLabel.setVerticalAlignment(JLabel.CENTER);
        guyLabel.setHorizontalAlignment(JLabel.CENTER);
        guyLabel.setIcon(guyIcon);
        JLabel congratsMesLabel = new JLabel("Congrats");
        congratsMesLabel.setVerticalAlignment(JLabel.CENTER);
        congratsMesLabel.setHorizontalAlignment(JLabel.CENTER);
        topMessage.add(guyLabel);
        topMessage.add(congratsMesLabel);

        // rating
        ImageIcon ratingIcon = new ImageIcon();
        JLabel ratingLable = new JLabel("Rating star star");
        ratingLable.setIcon(ratingIcon);
        ratingLable.setVerticalAlignment(JLabel.CENTER);
        ratingLable.setHorizontalAlignment(JLabel.CENTER);

        // questiong label
        JLabel questionLabel = new JLabel("May question here");
        questionLabel.setVerticalAlignment(JLabel.CENTER);
        questionLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel optionLabel = new JLabel();
        optionLabel.setVerticalAlignment(JLabel.CENTER);
        optionLabel.setHorizontalAlignment(JLabel.CENTER);
        optionLabel.setLayout(new FlowLayout());
        this.yes = new JButton("Yes");
        yes.addActionListener(this);
        JLabel or = new JLabel("OR");
        this.rest = new JButton("Rest");
        rest.addActionListener(this);
        optionLabel.add(yes);
        optionLabel.add(or);
        optionLabel.add(rest);

        // Componets
        ratingPanel.add(topMessage);
        ratingPanel.add(ratingLable);
        ratingPanel.add(questionLabel);
        ratingPanel.add(optionLabel);

        // frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        setVisible(true);
        setResizable(false);
        this.add(ratingPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource()==yes) {
            Frame1 frame = new Frame1();
        }else{
            Frame11 frame11 = new Frame11();
        }
        
    }
}
