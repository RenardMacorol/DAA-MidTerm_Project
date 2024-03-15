package src;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
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

public class Frame8 extends JFrame implements ActionListener {
    int output;
    ImageIcon messageIcon;

    Frame8(String input, int shortestDistance, int output) {
        this.output = output;
        // panel itself
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new GridBagLayout());
        outputPanel.setBounds(0, 0, 50, 50);

        // top message
        messageIcon = new ImageIcon(display());
        Image newImage = messageIcon.getImage();
        Image resized = newImage.getScaledInstance(1000, 500, java.awt.Image.SCALE_SMOOTH);
        JLabel messageLabel = new JLabel();

        messageLabel.setIcon(new ImageIcon(resized));

        messageLabel.setVerticalAlignment(JLabel.TOP);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        // shot output
        JPanel pathPanel = new JPanel();
        pathPanel.setLayout(new GridLayout(4, 0));
        JLabel shortPath = new JLabel("Shortest Route:");
        shortPath.setFont(new Font("DM SANS", Font.BOLD, 17));
        shortPath.setVerticalAlignment(JLabel.TOP);
        shortPath.setHorizontalAlignment(JLabel.LEFT);
        JLabel distance = new JLabel("Total Distance:");
        distance.setFont(new Font("DM SANS", Font.BOLD, 17));
        distance.setVerticalAlignment(JLabel.TOP);
        distance.setHorizontalAlignment(JLabel.LEFT);
        JLabel outputLabel = new JLabel();
        outputLabel.setText(input);
        outputLabel.setVerticalAlignment(JLabel.TOP);
        outputLabel.setHorizontalAlignment(JLabel.LEFT);
        outputLabel.setFont(new Font("DM SANS", Font.BOLD, 17));
        JLabel outputShortestLabel = new JLabel();
        outputShortestLabel.setText("Shortest Distance" + " " + shortestDistance);
        outputShortestLabel.setFont(new Font("DM SANS", Font.BOLD, 17));
        outputShortestLabel.setVerticalAlignment(JLabel.TOP);
        outputShortestLabel.setHorizontalAlignment(JLabel.LEFT);
        pathPanel.add(shortPath);
        pathPanel.add(outputLabel);
        pathPanel.add(distance);
        pathPanel.add(outputShortestLabel);

        // Button send invoice
        JButton invoicebButton = new JButton("Send Invoice");
        invoicebButton.addActionListener(this);

        // all components
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy=0;
        outputPanel.add(messageLabel, gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        outputPanel.add(pathPanel,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        outputPanel.add(invoicebButton,gbc);

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

    private String display() {
        if (output == 0) {
            return "NONE";
        }
        if (output == 1) {
            return "resources/page8/1panel_static.png";
        }
        if (output == 2) {
            return "NONE";
        }
        if (output == 3) {
            return "NONE";
        }
        if (output == 4) {
            return "NONE";
        }
        if (output == 5) {
            return "NONE";
        }
        return "not Found";
    }
}
