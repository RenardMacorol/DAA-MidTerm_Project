import javax.swing.*;

public class MainApp{
    public static void main(String[] args) {
        JFrame frame = new JFrame("ERE");
        JButton butones = new JButton("Shortest Path");
        //frame settings
        frame.setSize(1080,800);
        frame.setVisible(true); // sige i false moto yari ka sakin charutt
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Butones settings
        butones.setBounds(20,20,20,20);//isipin nyo yung butones parng rectancle 4 side rectangle diba
        //Add elements
        frame.add(butones);
    }
   
    
}