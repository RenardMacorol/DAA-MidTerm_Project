package src;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import src.KnapAndSort.KnapsackMain;

public class Frame4 extends JFrame implements ActionListener {
    int input;
    KnapsackMain knapSack;
    JTextPane textPane;
    String output;
    RoundedButton attitude;
    RoundedButton weight;
    RoundedButton value;
    RoundedButton proceed;
    Frame4(int input){
        this.input = input;
        System.out.println(input+"input Received");
        knapSack = new KnapsackMain(input);
        
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
        sortPanel.setBackground(Color.WHITE);

        //Display flowlayout here;
        JLabel sortByText = new JLabel("Sort By:");
        sortByText.setFont(new Font("Arial", Font.PLAIN, 17));

        attitude = new RoundedButton("Attitude", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 16);
        weight = new RoundedButton("Weight", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 16);
        value = new RoundedButton("Value", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 16);
        attitude.addActionListener(this);
        weight.addActionListener(this);
        value.addActionListener(this);


        sortPanel.add(sortByText);
        sortPanel.add(attitude);
        sortPanel.add(weight);
        sortPanel.add(value);
        
        output=knapSack.getProduct();
        output+=knapSack.getBestValue();
        textPane= new JTextPane();
        textPane.setContentType("text/plain");
        textPane.setText(output);
        
        JScrollPane tablePanel = new JScrollPane();
        tablePanel.setViewportView(textPane);
        tablePanel.setBounds(0,175,1000,410);
        tablePanel.setBackground(Color.WHITE);

        
        proceed = new RoundedButton("PROCEED", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 20);
        proceed.addActionListener(this);

        JFormattedTextField choose = new JFormattedTextField();
        choose.setPreferredSize(new Dimension(50,75));
        choose.setFont(new Font("Arial", Font.PLAIN, 20));
        choose.setForeground(Color.GRAY);
        choose.setBackground(Color.WHITE);
        choose.setCaretColor(Color.decode("#242323"));
        choose.setText("##");
        choose.setBorder(null);

        JLabel instruct = new JLabel("Choose a combination to proceed: ");
        instruct.setForeground(Color.decode("#242323"));
        instruct.setFont(new Font("Arial", Font.PLAIN, 17));


        JPanel giveBot = new JPanel();
        giveBot.setLayout(new FlowLayout());
        giveBot.setBounds(0, 585, 1000, 122);
        giveBot.setBackground(Color.WHITE);

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
        if(e.getSource() == attitude) {
            updateTextPane(knapSack.getProduct());
        }
        if(e.getSource() == value) {
            updateTextPane(knapSack.getValue());
        }
        if(e.getSource() == weight) {
            updateTextPane(knapSack.getWeight());
        }
        if(e.getSource() == proceed) {
            dispose();
            Frame5 frame5 = new Frame5(); 
        }
        
    }
    private void updateTextPane(String newText) {
        textPane.setText(newText);
    }
    

}
