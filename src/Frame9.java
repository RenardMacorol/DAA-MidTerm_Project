package src;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame9 extends JFrame implements ActionListener {
    Frame9() {
        JPanel invoicePanel = new JPanel();
        invoicePanel.setLayout(new GridLayout(3, 0));
        invoicePanel.setBounds(0, 0, 500, 500);

        // guys image and message
        JLabel topMessage = new JLabel();
        topMessage.setLayout(new FlowLayout());
        ImageIcon guyIcon = new ImageIcon();
        ImageIcon guyMessageImageIcon = new ImageIcon();
        JLabel message = new JLabel(guyMessageImageIcon);
        message.setText("Some text");
        JButton guyButton = new JButton();
        guyButton.addActionListener(this);
        guyButton.setIcon(guyIcon);
        topMessage.add(guyButton);
        topMessage.add(message);

        // output
        JLabel output = new JLabel("Output here");
        output.setVerticalAlignment(JLabel.CENTER);
        output.setHorizontalAlignment(JLabel.CENTER);
        
        //another message
        JLabel anotherMessage = new JLabel("Another message");
        anotherMessage.setVerticalAlignment(JLabel.CENTER);
        anotherMessage.setHorizontalAlignment(JLabel.CENTER);
        // import all components
        invoicePanel.add(topMessage);
        invoicePanel.add(output);
        invoicePanel.add(anotherMessage);

        //frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
        setVisible(true);
        setResizable(false);
        this.add(invoicePanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Frame10 frame10 = new Frame10();
    }
}
