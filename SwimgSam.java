import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwimgSam extends JFrame {

    public  SwimgSam(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT,10, 30));

        for (int i = 1; i <= 1; i++) {
            container.add(new JLabel("Hello"));
            container.add(new JTextField(20));
        }
    }
    public static void main(String[] args) {
        SwimgSam sm = new SwimgSam();
        sm.setSize(300,320);
        sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sm.setVisible(true);
    }
}
