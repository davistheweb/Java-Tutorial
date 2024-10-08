import javax.swing.*;
import java.awt.*;

public class MyNewFrame extends JFrame {
    public MyNewFrame(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 10,20));
        for(int i = 1; i <= 1; i++){
            container.add(new JLabel("Hello"));
            container.add(new JButton("Click"));
            container.add(new JTextField("Textfield"));
        }


    }

    public static void main(String[] args) {
        MyNewFrame f = new MyNewFrame();
        f.setTitle("my app");
        f.pack();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
