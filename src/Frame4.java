package src;

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

public class Frame4 extends JFrame implements ActionListener{
    Frame4(){
        //Panel for this
        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(new GridLayout(5,0));
        choicePanel.setBounds(0,0,500,500);

        //Label in the top
        ImageIcon topMessage = new ImageIcon();
        JLabel topMessageLabel = new JLabel("Here's what you can give:");
        topMessageLabel.setIcon(topMessage);
        topMessageLabel.setHorizontalAlignment(JLabel.CENTER);
        topMessageLabel.setVerticalAlignment(JLabel.CENTER);

        //Display flowlayout here
        JLabel sortByLabel = new JLabel();
        sortByLabel.setLayout(new FlowLayout());
        JLabel sortByText = new JLabel("Sort By");
        JButton attitudeButton = new JButton("Attitude");
        JButton weigthButton = new JButton("Weight");
        JButton valueButton = new JButton("Value");
        sortByLabel.add(sortByText);
        sortByLabel.add(attitudeButton);
        sortByLabel.add(weigthButton);
        sortByLabel.add(valueButton);
        //Table here
        JLabel sortedTable = new JLabel("There's a table here");
        sortedTable.setHorizontalAlignment(JLabel.CENTER);
        sortedTable.setVerticalAlignment(JLabel.CENTER);
        //Text field here
        JLabel comboProceed = new JLabel("There's a TextField here");
        comboProceed.setHorizontalAlignment(JLabel.CENTER);
        comboProceed.setVerticalAlignment(JLabel.CENTER);
        
        
        JButton proceed = new JButton("Proceed");
        proceed.addActionListener(this);
        
        //Import all components
        choicePanel.add(topMessageLabel);
        choicePanel.add(sortByLabel);
        choicePanel.add(sortedTable);
        choicePanel.add(comboProceed);
        choicePanel.add(proceed);
        //frame settings
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null);//center the window to screen when run
        setVisible(true);
        setResizable(false);
        this.add(choicePanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame5 frame5 = new Frame5();
    }   
    
}
