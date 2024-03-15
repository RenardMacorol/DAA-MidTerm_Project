package src;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame8 extends JFrame implements ActionListener {
    Frame8(String input, int shortestDistance) {
        // panel itself
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(4, 0));
        outputPanel.setBounds(0, 0, 50, 50);

        // top message
        ImageIcon messageIcon = new ImageIcon();
        JLabel messageLabel = new JLabel("Your best route");
        messageLabel.setIcon(messageIcon);
        messageLabel.setPreferredSize(new Dimension(20, 20));
        messageLabel.setBounds(0, 500, 500, 500);
        messageLabel.setVerticalAlignment(JLabel.TOP);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        // shot output
        JLabel outputLabel = new JLabel();
        outputLabel.setText(input);
        outputLabel.setVerticalAlignment(JLabel.BOTTOM);
        outputLabel.setHorizontalAlignment(JLabel.LEFT);
        outputLabel.setFont(new Font("DM SANS", Font.BOLD, 17));
        JLabel outputShortestLabel = new JLabel();
        outputShortestLabel.setText("Shortest Distance" + " " + shortestDistance);
        outputShortestLabel.setFont(new Font("DM SANS", Font.BOLD, 17));
        outputShortestLabel.setVerticalAlignment(JLabel.TOP);
        outputShortestLabel.setHorizontalAlignment(JLabel.LEFT);

        // Button send invoice
        JButton invoicebButton = new JButton("Send Invoice");
        invoicebButton.addActionListener(this);
      
       
        // all components
        outputPanel.add(messageLabel);
        outputPanel.add(outputLabel);
        outputPanel.add(outputShortestLabel);
        outputPanel.add(invoicebButton);

        // frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        setVisible(true);
        setResizable(false);
        this.add(outputPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame9 frame9 = new Frame9();
    }
}
