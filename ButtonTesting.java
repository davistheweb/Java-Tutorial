import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonTesting extends JFrame implements ActionListener {
    JButton next = new JButton("Next");
    MyNewFrame m = new MyNewFrame();

   public ButtonTesting(){
       getContentPane().setLayout(new FlowLayout());
       getContentPane().add(next);
       next.addActionListener(this);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            m.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        ButtonTesting bt = new ButtonTesting();
        bt.setTitle("Testing");
        bt.setSize(100,500);
        bt.pack();
        bt.setVisible(true);
        bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
