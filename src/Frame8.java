package src;

import java.awt.Dimension;
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
    Frame8() {
        // panel itself
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(3, 0));
        outputPanel.setBounds(0, 0, 500, 500);

        // top message
        ImageIcon messageIcon = new ImageIcon();
        JLabel messageLabel = new JLabel("Your best route");
        messageLabel.setIcon(messageIcon);
        messageLabel.setPreferredSize(new Dimension(20, 20));
        messageLabel.setBounds(0, 500, 500, 500);
        messageLabel.setVerticalAlignment(JLabel.CENTER);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        // shot output
        JLabel outputLabel = new JLabel();
        outputLabel.setText("Route Route etc");
        outputLabel.setVerticalAlignment(JLabel.CENTER);
        outputLabel.setHorizontalAlignment(JLabel.CENTER);
        

        // Button send invoice
        JButton invoicebButton = new JButton("Send Invoice");
        invoicebButton.addActionListener(this);
        //all components
        outputPanel.add(messageLabel);
        outputPanel.add(outputLabel);
        outputPanel.add(invoicebButton);

        //frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
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
