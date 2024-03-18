package src;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

import javax.swing.text.JTextComponent;

import src.KnapSort.Operation;

import java.awt.Cursor;

public class Frame3 extends JFrame implements ActionListener {
    public int knapInput;
    public RoundedButton seeResults;
    JTextField choose;

    Frame3() {
        // Panel for this
        JPanel but = new JPanel();
        but.setBounds(0, 0, 1000, 220);
        but.setBackground(Color.decode("#FDFDFD"));

        // Label in the top
        ImageIcon butWaitIcon = new ImageIcon("resources/page3/ButWait.png");
        JLabel butWaitLabel = new JLabel();
        butWaitLabel.setIcon(butWaitIcon);

        but.add(butWaitLabel);

        JPanel butTable = new JPanel();
        butTable.setBounds(0, 220, 1000, 240);
        butTable.setBackground(Color.decode("#FDFDFD"));

        DefaultTableModel blue = new DefaultTableModel();
        blue.addColumn("#");
        blue.addColumn("ATTITUDE");
        blue.addColumn("WEIGHT");
        blue.addColumn("VALUE");

        Operation op = new Operation();
        blue.addRow(new Object[]{blue.getColumnName(0), blue.getColumnName(1), 
                                blue.getColumnName(2), blue.getColumnName(3)});
        for(int i = 0; i<op.getItemArray().length; i++){
            blue.addRow(new Object[]{i+1, op.getItemArray()[i].getProductName(), 
                                    op.getItemArray()[i].getWeight(), op.getItemArray()[i].getValue()});
        }

        JTable tab = new JTable(blue);
        tab.setBorder(null);
        tab.setBackground(Color.decode("#FDFDFD"));
        tab.setFont(new Font("DM SANS", Font.PLAIN, 25));
        tab.setShowGrid(false);
        tab.setShowHorizontalLines(false);
        tab.setShowVerticalLines(false);
        tab.setIntercellSpacing(new Dimension(0,0));
        tab.getColumnModel().getColumn(0).setPreferredWidth(50);
        tab.getColumnModel().getColumn(1).setPreferredWidth(230);
        tab.getColumnModel().getColumn(2).setPreferredWidth(200);
        tab.getColumnModel().getColumn(3).setPreferredWidth(150);
        tab.setRowHeight(35);

        butTable.add(tab);
    
        JPanel butEnter = new JPanel();
        butEnter.setBounds(0, 450, 755, 100);
        butEnter.setBackground(Color.decode("#FDFDFD"));

        // Enter your heart capacity with inputField
        ImageIcon heart = new ImageIcon("resources/page3/Heart.png");
        JLabel input = new JLabel();
        input.setIcon(heart);

        butEnter.add(input);

        JPanel butEnter2 = new JPanel(new BorderLayout());
        butEnter2.setBounds(755, 450, 245, 100);
        butEnter2.setBackground(Color.decode("#FDFDFD"));

        choose = new JTextField();

        choose.setPreferredSize(new Dimension(50, 75));
        choose.setFont(new Font("Arial", Font.PLAIN, 50));

        choose.setForeground(Color.GRAY);
        choose.setBackground(Color.decode("#FDFDFD"));
        choose.setCaretColor(Color.decode("#242323"));
        choose.setText("1-15");
        choose.setBorder(null);
        ((AbstractDocument) choose.getDocument()).setDocumentFilter(new IntegerFilter());
        butEnter2.add(choose, BorderLayout.SOUTH);

        JPanel butBot = new JPanel();
        butBot.setBounds(0, 550, 1000, 157);
        butBot.setBackground(Color.decode("#FDFDFD"));


        // See result Button
        seeResults = new RoundedButton("ENTER", Color.decode("#242323"), Color.WHITE, 30, 0, 0, "Arial",
                20);

        seeResults.addActionListener(this);
        seeResults.setCursor(new Cursor(Cursor.HAND_CURSOR));

        butBot.add(seeResults);

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

        this.add(but);
        this.add(butTable);
        this.add(butEnter);
        this.add(butEnter2);
        this.add(butBot);

    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == seeResults) {
            String textInput = choose.getText();
            knapInput = Integer.parseInt(textInput);
            if (knapInput>=1 && knapInput <= 15){
                dispose();
                Frame4 frame4 = new Frame4(knapInput);
            }
            
        }

    }
}