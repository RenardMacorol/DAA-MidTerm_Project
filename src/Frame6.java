package src;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame6 extends JFrame implements ActionListener{
    Frame6(){
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new GridLayout(3,0));
        searchPanel.setBounds(0, 0, 500, 500);

        //label top
        ImageIcon messageIcon = new ImageIcon();
        JLabel topMessageLabel = new JLabel("find this guy?");
        topMessageLabel.setIcon(messageIcon);
        topMessageLabel.setVerticalAlignment(JLabel.CENTER);
        topMessageLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel guyInput = new JLabel("Text field here for search");
        guyInput.setVerticalAlignment(JLabel.CENTER);
        guyInput.setHorizontalAlignment(JLabel.CENTER);

        JLabel findsLabel = new JLabel();
        //gawa kayo variable na may mag pass ng rowss and coll dine
        findsLabel.setLayout(new GridLayout(2,2));
        //user for loop instead
        JLabel findtext1 = new JLabel("Tunog stree");
        JLabel findtext2 = new JLabel("lima stree");
        JButton button1 = new JButton("Pick");
        button1.addActionListener(this);
        JButton button2 = new JButton("Pick");
        button2.addActionListener(this);
        findsLabel.add(findtext1);
        findsLabel.add(button1);
        findsLabel.add(findtext2);
        findsLabel.add(button2);

        //import all label in panel
        searchPanel.add(topMessageLabel);
        searchPanel.add(guyInput);
        searchPanel.add(findsLabel);

        //frame settings
       ImageIcon icon = new ImageIcon("resources/MainIcon.png");
       setIconImage(icon.getImage());
       setLayout(null);
       setTitle("This Guy Needs Some Attitude");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1000, 707);
       setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);

        this.add(searchPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame7 frame7 = new Frame7();
    }


}
