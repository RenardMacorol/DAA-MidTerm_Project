package src;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
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
        ratingPanel.setBounds(100, 400, 1000 , 500);

        // Upper area 5
        JLabel topMessage = new JLabel();
        topMessage.setLayout(new FlowLayout());
        topMessage.setVerticalAlignment(JLabel.CENTER);
        topMessage.setHorizontalAlignment(JLabel.CENTER);

        
        ImageIcon guyIcon = new ImageIcon("resources/page10/guy-5star.png");
        setIconImage(guyIcon.getImage());
        JLabel guyLabel = new JLabel();
        guyLabel.setHorizontalAlignment(JLabel.CENTER);
        guyLabel.setPreferredSize(new Dimension(1000, 346));
        guyLabel.setIcon(guyIcon);
        topMessage.add(guyLabel);
       


        // rating
        ImageIcon ratingIcon = new ImageIcon("resources/page10/5star-rate.png");
        setIconImage(ratingIcon.getImage());
        JLabel ratingLable = new JLabel();
        ratingLable.setIcon(ratingIcon);
        ratingLable.setVerticalAlignment(JLabel.BOTTOM);
        ratingLable.setHorizontalAlignment(JLabel.CENTER);


        // questiong label
        ImageIcon questionIcon = new ImageIcon("resources/page10/3panel_static.png");
        setIconImage(questionIcon.getImage());
        JLabel questionLabel = new JLabel();
        questionLabel.setIcon(questionIcon);
        questionLabel.setVerticalAlignment(JLabel.BOTTOM);
        questionLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setBounds(0, 1000, 1000, 100);

        RoundedButton yes = new RoundedButton("YES", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 22);
        yes.setBounds(350, 50, 95, 49); 
        yes.addActionListener(this);
        buttonPanel.add(yes);

        ImageIcon orIcon = new ImageIcon("resources/page10/4panel-or_static.png");
        JLabel orLabel = new JLabel(orIcon);
        orLabel.setBounds(400,50,50,50);

        RoundedButton rest = new RoundedButton("REST", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 22);
        rest.setBounds(550, 50, 95, 49); 
        rest.addActionListener(this);
        buttonPanel.add(rest);

        JLabel optionLabel = new JLabel();
        optionLabel.setVerticalAlignment(JLabel.CENTER);
        optionLabel.setHorizontalAlignment(JLabel.CENTER);
        optionLabel.setLayout(new FlowLayout());
        /**this.yes = new JButton("Yes");
        yes.addActionListener(this);
        JLabel or = new JLabel("OR");
        this.rest = new JButton("Rest");
        rest.addActionListener(this);
        optionLabel.add(yes);
        optionLabel.add(or);
        optionLabel.add(rest);*/

        // Componets
        ratingPanel.add(topMessage);
        ratingPanel.add(ratingLable);
        ratingPanel.add(questionLabel);
        ratingPanel.add(buttonPanel, orLabel);

        // frame settings
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null);//center the window to screen when run
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
