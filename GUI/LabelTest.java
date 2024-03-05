package GUI;
import javax.swing.JLabel;

public class LabelTest extends Frame {
    JLabel label ;

    public LabelTest(){
        //label Settings
        label = new JLabel("Midterm Project");
        label.setBounds(200, 200, 200, 200);
        frame.add(label);
    }
 
}
