package src;

import src.AddressSearch.AddressSearchOption;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Class for the main frame
public class Frame6 extends JFrame implements ActionListener {
    private JFormattedTextField userAddress; // Text field for user address input
    RoundedButton proceedButton;
    JLabel output; 
    JButton nextButton;// New button for "Next"

    // Constructor to initialize the frame and UI components
    Frame6() {
        JPanel searchPanel = new JPanel(); // Panel for search components
        searchPanel.setBounds(0, 0, 1000, 315);
        searchPanel.setBackground(Color.decode("#FDFDFD"));

        // Icon for search panel
        ImageIcon messageIcon = new ImageIcon("resources/page6/1pane_static.png");
        JLabel messageIconLabel = new JLabel(messageIcon);
        searchPanel.add(messageIconLabel);

        // Panel for user input components
        JPanel userInputPanel = new JPanel();
        userInputPanel.setBounds(0, 315, 1000, 43);
        userInputPanel.setBackground(Color.decode("#FDFDFD"));
        userInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        userAddress = new JFormattedTextField(); // Text field for user address input
        userAddress.setPreferredSize(new Dimension(200, 43));
        userAddress.setFont(new Font("Arial", Font.PLAIN, 20));
        userAddress.setForeground(Color.GRAY);
        userAddress.setBackground(Color.WHITE);
        userAddress.setCaretColor(Color.decode("#242323"));
        userAddress.setText("Type Address Here");
        userAddress.setBorder(null);

        // Button for initiating search
        proceedButton = new RoundedButton("Search", Color.decode("#242323"), Color.WHITE, 30, 0, 0, "Arial", 20);
        proceedButton.addActionListener(this);


        // Panel for organizing address field and button
        JPanel addressPanel = new JPanel(new BorderLayout());
        addressPanel.add(userAddress, BorderLayout.CENTER);
        addressPanel.add(proceedButton, BorderLayout.EAST);

         //eto example naka attributes to pia ah need yan
        JPanel printPanel = new JPanel();
        output =  new JLabel("Matched address will appear were");
        printPanel.add(output);
        printPanel.setBounds(0, 358, 1000, 349);
        printPanel.setBackground(Color.decode("#FDFDFD"));

        userInputPanel.add(addressPanel);
        searchPanel.add(userInputPanel);
        searchPanel.add(printPanel);

       

        setTitle("This Guy Needs Some Attitude"); // Set frame title
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 707); // Set frame size
        ImageIcon logo = new ImageIcon("resources//AttitudeIcon.png");
        setIconImage(logo.getImage()); // Set frame icon
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true); // Make the frame visible
        setResizable(false); // Disable frame resizing
        add(searchPanel); // Add search panel to the frame

        //next button format

        nextButton = new RoundedButton("Proceed", Color.decode("#242323"), Color.WHITE, 30, 0, 0, "Arial", 20);
        

        nextButton = new JButton("Proceed");
        nextButton.setEnabled(false); // Initially disabled
        nextButton.setFont(new Font("Arial", Font.PLAIN, 20));
        nextButton.setForeground(Color.WHITE);
        nextButton.setBackground(Color.decode("#242323"));
        nextButton.setBorderPainted(false);
        nextButton.setFocusPainted(false);
        nextButton.setOpaque(true);
        nextButton.setPreferredSize(new Dimension(50, 40));
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle "Next" button click, navigate to page 7
                dispose(); // Close current frame
                new Frame7(); // Open next frame (assuming Frame7 is another JFrame class)
            }
        });

        // Add "Next" button to the frame
        add(nextButton, BorderLayout.SOUTH);
    }
    

    // ActionListener implementation for handling button click
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == proceedButton) {
            System.out.println("Search button clicked");
            AddressSearchOption addressSearchOption = new AddressSearchOption(userAddress.getText());
            String searchResult = addressSearchOption.getPass();
            searchResult = formatSearchResult(searchResult);
            output.setText(searchResult);

            // Enable the "Next" button after the search button is clicked
            nextButton.setEnabled(true);
        }
    }

    private String formatSearchResult(String searchResult) {
        searchResult = searchResult.replaceAll("\n", "<br>");
        searchResult = "<html>" + searchResult + "</html>";
        return searchResult;
    }
}