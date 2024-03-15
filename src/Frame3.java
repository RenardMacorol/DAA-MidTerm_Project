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
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.NumberFormatter;

import src.KnapAndSort.KnapsackMain;

public class Frame3 extends JFrame implements ActionListener {
    public int knapInput;
    public RoundedButton seeResults;
    JTextField choose;

    Frame3() {
        // Panel for this
        JPanel but = new JPanel();
        but.setBounds(0, 0, 1000, 210);

        // Label in the top
        ImageIcon butWaitIcon = new ImageIcon("resources/page3/ButWait.png");
        JLabel butWaitLabel = new JLabel();
        butWaitLabel.setIcon(butWaitIcon);

        but.add(butWaitLabel);

        JPanel butTable = new JPanel();
        butTable.setBounds(0, 210, 1000, 240);
        butTable.setBackground(Color.decode("#FDFDFD"));

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

        NumberFormatter nf = new NumberFormatter();
        nf.setValueClass(Integer.class);
        nf.setMinimum(1);
        nf.setMaximum(15);


        choose = new JTextField();

        choose.setPreferredSize(new Dimension(50, 75));
        choose.setFont(new Font("Arial", Font.PLAIN, 20));

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
        dispose();
        if (e.getSource() == seeResults) {

            String textInput = choose.getText();
            knapInput = Integer.parseInt(textInput);
            Frame4 frame4 = new Frame4(knapInput);
        }

    }
}