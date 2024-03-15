package src;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument;

import java.awt.Cursor;

public class Frame4 extends JFrame implements ActionListener{
    Frame4(){
        //Panel for this
        JPanel givePanel = new JPanel();
        givePanel.setBounds(0,0,1000,110);

        //Label in the top
        ImageIcon topMessage = new ImageIcon("resources/page4/Give.png");
        JLabel topMessageLabel = new JLabel();
        topMessageLabel.setIcon(topMessage);

        givePanel.add(topMessageLabel);

        //Panel for this
        JPanel sortPanel = new JPanel();
        sortPanel.setBounds(0,110,1000,65);
        sortPanel.setLayout(new FlowLayout());
        sortPanel.setBackground(Color.decode("#FDFDFD"));

        //Display flowlayout here;
        JLabel sortByText = new JLabel("Sort By:");
        sortByText.setFont(new Font("DM SANS", Font.PLAIN, 17));

        RoundedButton attitude = new RoundedButton("ATTITUDE", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 16);
        RoundedButton weight = new RoundedButton("WEIGHT", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 16);
        RoundedButton value = new RoundedButton("VALUE", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 16);
        
        attitude.setCursor(new Cursor(Cursor.HAND_CURSOR));
        weight.setCursor(new Cursor(Cursor.HAND_CURSOR));
        value.setCursor(new Cursor(Cursor.HAND_CURSOR));

        sortPanel.add(sortByText);
        sortPanel.add(attitude);
        sortPanel.add(weight);
        sortPanel.add(value);
        
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(0,175,1000,410);
        tablePanel.setBackground(Color.decode("#FDFDFD"));
        
        RoundedButton proceed = new RoundedButton("PROCEED", Color.decode("#242323"), Color.WHITE, 30,0,0, "DM SANS", 20);
        proceed.addActionListener(this);
        proceed.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JFormattedTextField choose = new JFormattedTextField();
        choose.setPreferredSize(new Dimension(50,75));
        choose.setFont(new Font("Arial", Font.PLAIN, 30));
        choose.setForeground(Color.GRAY);
        choose.setBackground(Color.decode("#FDFDFD"));
        choose.setCaretColor(Color.decode("#242323"));
        choose.setText("##");
        choose.setBorder(null);
        ((AbstractDocument) choose.getDocument()).setDocumentFilter(new IntegerFilter());

        JLabel instruct = new JLabel("Choose a combination to proceed: ");
        instruct.setForeground(Color.decode("#242323"));
        instruct.setFont(new Font("Arial", Font.PLAIN, 17));


        JPanel giveBot = new JPanel();
        giveBot.setLayout(new FlowLayout());
        giveBot.setBounds(0, 585, 1000, 122);
        giveBot.setBackground(Color.decode("#FDFDFD"));

        giveBot.add(instruct);
        giveBot.add(choose);
        giveBot.add(proceed);
       

        //Import all components
        this.add(givePanel);
        this.add(sortPanel);
        this.add(tablePanel);
        this.add(giveBot);
        
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame5 frame5 = new Frame5();
    }   
    
}
