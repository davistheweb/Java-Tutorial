// Work done by Isaac Emmanuel chinweolu, MatNo: 22/5868
import  javax.swing.JOptionPane;
public class SwapMatricNo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Swap Matric Number", "title", JOptionPane.INFORMATION_MESSAGE);
        String MatNo = JOptionPane.showInputDialog(null, "Enter matric Number", "Mat No", JOptionPane.QUESTION_MESSAGE);
        int matNum = Integer.parseInt(MatNo);
        int First_Swapper = matNum / 10;
        int Second_Swapper = matNum % 10;
        JOptionPane.showMessageDialog(null, "Mat No before swapped " + First_Swapper + Second_Swapper, ".", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mat No after swapped " + Second_Swapper + First_Swapper, "title", JOptionPane.INFORMATION_MESSAGE);
    }
}