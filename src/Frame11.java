package src;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame11 extends JFrame {
    Frame11() {
        JPanel creditsPanel = new JPanel();
        creditsPanel.setLayout(new GridLayout(2, 0));
        creditsPanel.setBounds(0, 0, 500, 500);

        ImageIcon thankyouIcon = new ImageIcon();
        JLabel thankJLabel = new JLabel("Salamat");
        thankJLabel.setVerticalAlignment(JLabel.CENTER);
        thankJLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel creditsMembersPanel = new JPanel();
        creditsMembersPanel.setLayout(new GridLayout(5, 5));
        JLabel programmers = new JLabel("Programmers");
        programmers.setVerticalAlignment(JLabel.CENTER);
        programmers.setHorizontalAlignment(JLabel.CENTER);
        JLabel pia = new JLabel("Pia Katleya V. Macalanda");
        pia.setVerticalAlignment(JLabel.CENTER);
        pia.setHorizontalAlignment(JLabel.CENTER);
        JLabel wonka = new JLabel("Renard B. Macorol");
        wonka.setVerticalAlignment(JLabel.CENTER);
        wonka.setHorizontalAlignment(JLabel.CENTER);
        JLabel juls = new JLabel("Juliana R. Mancera");
        juls.setVerticalAlignment(JLabel.CENTER);
        juls.setHorizontalAlignment(JLabel.CENTER);
        JLabel thoby = new JLabel("Thoby Jim R. Ralleta");
        thoby.setVerticalAlignment(JLabel.CENTER);
        thoby.setHorizontalAlignment(JLabel.CENTER);
        JLabel section = new JLabel("2BSCS-1 A.Y 2023-2024");
        section.setVerticalAlignment(JLabel.CENTER);
        section.setHorizontalAlignment(JLabel.LEFT);
        JLabel group = new JLabel("Group 5");
        group.setVerticalAlignment(JLabel.CENTER);
        group.setHorizontalAlignment(JLabel.LEFT);
        JLabel courseCode = new JLabel("CCS223-18");
        courseCode.setVerticalAlignment(JLabel.CENTER);
        courseCode.setHorizontalAlignment(JLabel.LEFT);
        JLabel course = new JLabel("Design and Analysis of Algorithms");
        course.setVerticalAlignment(JLabel.CENTER);
        course.setHorizontalAlignment(JLabel.LEFT);
        JLabel proffersor = new JLabel("Prof. Mary Jane  V. Lima");
        proffersor.setVerticalAlignment(JLabel.CENTER);
        proffersor.setHorizontalAlignment(JLabel.LEFT);
        creditsMembersPanel.add(programmers);
        creditsMembersPanel.add(section);
        creditsMembersPanel.add(pia);
        creditsMembersPanel.add(group);
        creditsMembersPanel.add(wonka);
        creditsMembersPanel.add(courseCode);
        creditsMembersPanel.add(juls);
        creditsMembersPanel.add(course);
        creditsMembersPanel.add(thoby);
        creditsMembersPanel.add(proffersor);

        creditsPanel.add(thankJLabel);
        creditsPanel.add(creditsMembersPanel);
        // frame settings
        setTitle("Midterm Project");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 563);
        setVisible(true);
        setResizable(false);
        this.add(creditsPanel);
    }

}
