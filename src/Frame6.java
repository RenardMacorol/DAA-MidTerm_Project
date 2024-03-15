package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import src.AddressSearch.AddressSearchOption;

public class Frame6 extends JFrame implements ActionListener {
    private JFormattedTextField guyAddress;

    Frame6() {
        JPanel searchPanel = new JPanel();
        searchPanel.setBounds(0, 0, 1000, 315);
        searchPanel.setBackground(Color.decode("#FDFDFD"));

        // Top panel
        ImageIcon messageIcon = new ImageIcon("resources/page6/1pane_static.png");
        JLabel messageIconLabel = new JLabel(messageIcon);
        searchPanel.add(messageIconLabel);

        // Search panel
        JPanel guyInput = new JPanel();
        guyInput.setBounds(0, 315, 1000, 43);
        guyInput.setBackground(Color.decode("#FDFDFD"));
        guyInput.setLayout(new FlowLayout(FlowLayout.LEFT));

        guyAddress = new JFormattedTextField();
        guyAddress.setPreferredSize(new Dimension(200, 43));
        guyAddress.setFont(new Font("Arial", Font.PLAIN, 20));
        guyAddress.setForeground(Color.GRAY);
        guyAddress.setBackground(Color.WHITE);
        guyAddress.setCaretColor(Color.decode("#242323"));
        guyAddress.setText("Type Address Here");
        guyAddress.setBorder(null);

        // Button
        RoundedButton proceed = new RoundedButton("Search", Color.decode("#242323"), Color.WHITE, 30, 0, 0, "Arial", 20);
        proceed.addActionListener(this);

        // Adding the address field and button to a panel
        JPanel addressPanel = new JPanel(new BorderLayout());
        addressPanel.add(guyAddress, BorderLayout.CENTER);
        addressPanel.add(proceed, BorderLayout.EAST);

        // Adding the panel with address field and button to guyInput panel
        guyInput.add(addressPanel);
        searchPanel.add(guyInput);

        //Print searched address panel
        JPanel printPanel = new JPanel();
        printPanel.setBounds(0, 358, 1000, 349);
        printPanel.setBackground(Color.decode("#FDFDFD"));
    

        // Frame settings
        setTitle("This Guy Needs Some Attitude");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707);
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null); // Center the window to screen when run
        setVisible(true);
        setResizable(false);
        add(searchPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AddressSearchOption addressSearchOption = new AddressSearchOption(this);
        addressSearchOption.performSearch();
    }

    // Method to get user input from guyAddress
    public String getUserInput() {
        return guyAddress.getText();
    }
}
