package src;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.AbstractDocument;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import src.KnapSort.*;

public class Frame4 extends JFrame implements ActionListener {
    
    DefaultTableModel blue;
    int input;
    KnapsackMain knapSack;
    JTextPane textPane;
    String output;
    RoundedButton attitude;
    RoundedButton weight;
    RoundedButton value;
    RoundedButton proceed;
    JFormattedTextField choose;

    Frame4(int input){
        
        this.input = input;
        System.out.println(input+"input Received");
        
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

        attitude = new RoundedButton("ATTITUDE", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 16);
        weight = new RoundedButton("WEIGHT", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 16);
        value = new RoundedButton("VALUE", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 16);
        attitude.addActionListener(this);
        weight.addActionListener(this);
        value.addActionListener(this);

        sortPanel.add(sortByText);
        sortPanel.add(attitude);
        sortPanel.add(weight);
        sortPanel.add(value);
        
        blue = new NewTable();
        blue.addColumn("#");
        blue.addColumn("ATTITUDE/s");
        blue.addColumn("WEIGHT");
        blue.addColumn("VALUE");
        blue.addColumn("REMARK");

        Operation op = new Operation();
        op.findFeasible(input);
        for(int i = 0; i<op.getFeasibleList().size(); i++){            
            if(op.getVTotal().get(i) == op.bestValue(input)){
                blue.addRow(new Object[]{i+1, op.haveProductName(op.getFeasibleList().get(i)), 
                    op.getWTotal().get(i), op.getVTotal().get(i),"BEST"});
            }
            else{
                blue.addRow(new Object[]{i+1, op.haveProductName(op.getFeasibleList().get(i)), 
                    op.getWTotal().get(i), op.getVTotal().get(i)," "});
            }
        }

        JTable tab = new JTable(blue);
        tab.setBorder(null);
        tab.setBackground(Color.decode("#FDFDFD"));
        tab.setFont(new Font("DM SANS", Font.PLAIN, 14));
        tab.setShowGrid(false);
        tab.setShowHorizontalLines(false);
        tab.setShowVerticalLines(false);
        tab.setIntercellSpacing(new Dimension(0,0));
        tab.getColumnModel().getColumn(0).setPreferredWidth(50);
        tab.getColumnModel().getColumn(1).setPreferredWidth(230);
        tab.getColumnModel().getColumn(2).setPreferredWidth(200);
        tab.getColumnModel().getColumn(3).setPreferredWidth(150);
        tab.getColumnModel().getColumn(3).setPreferredWidth(50);
        tab.setRowHeight(25);
        tab.setAlignmentX(JTable.CENTER_ALIGNMENT);

        JScrollPane tablePanel = new JScrollPane(tab);
        tablePanel.setBounds(0,175,1000,410);
        tablePanel.setBackground(Color.decode("#FDFDFD"));
    
        proceed = new RoundedButton("PROCEED", Color.decode("#242323"), Color.WHITE, 30,0,0, "Arial", 20);
        proceed.addActionListener(this);
        proceed.setCursor(new Cursor(Cursor.HAND_CURSOR));

       /* choose = new JFormattedTextField();
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
        instruct.setFont(new Font("DM SANS", Font.PLAIN, 17));
         */

        JPanel giveBot = new JPanel();
        giveBot.setLayout(new FlowLayout());
        giveBot.setBounds(0, 585, 1000, 122);
        giveBot.setBackground(Color.decode("#FDFDFD"));

       // giveBot.add(instruct);
        //giveBot.add(choose);
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
        JFrame att = new JFrame();

       att.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       att.setSize(1000, 500);
       att.setVisible(true);
       att.setResizable(false);
       att.setLocationRelativeTo(null);
        
       JTextPane p = new JTextPane();
       Operation op = new Operation();
        op.findFeasible(input);
        op.printSort();
        String names = op.getProductName();
        p.setText(names);

        att.add(p);


        }
        if(e.getSource() == value) {
            JFrame att = new JFrame();

            att.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            att.setSize(1000, 500);
            att.setVisible(true);
            att.setResizable(false);
            att.setLocationRelativeTo(null);
        
       JTextPane p = new JTextPane();
       Operation op = new Operation();
        op.findFeasible(input);
        op.printSort();
        String names = op.getValue();
        p.setText(names);
        att.add(p);

        }
        if(e.getSource() == weight) {
            JFrame att = new JFrame();
            att.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            att.setSize(1000, 500);
            att.setVisible(true);
            att.setResizable(false);
            att.setLocationRelativeTo(null);
        
       JTextArea p = new JTextArea();
       Operation op = new Operation();
        op.findFeasible(input);
        op.printSort();
        String names = op.getWeight();
        p.setText(names);
        att.add(p);

        }
        if(e.getSource() == proceed) {
            dispose();
            Frame5 frame5 = new Frame5(); 
        }
        
    }
}