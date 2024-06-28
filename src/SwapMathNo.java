package src;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class SwapMathNo {
    public static void main (String[] args) {
        //Scanner MatNoInput = new Scanner(System.in);
        //System.out.print("Enter MatNo: ");

        JOptionPane.showMessageDialog(null,"Do not enter input string, integers 'Numbers' only!", "Warning message", JOptionPane.WARNING_MESSAGE);
        //Null as parent component, "Enter mat number" As message, "Dialog for MatNo" AS title, JOptionPane.WARNING_MESSAGE As message type
        String StrMatNo = JOptionPane.showInputDialog(null,"Enter mat number","Dialog for MatNo",JOptionPane.QUESTION_MESSAGE);//MatNoInput.nextInt();
        int matNo = Integer.parseInt(StrMatNo);
        int FirstNum = matNo /10;
        int SecondNum = matNo % 10;

        //System.out.println("MatNo before swapped : "+ FirstNum + SecondNum);
        JOptionPane.showMessageDialog(null,"MatNo before Swapped: "+FirstNum + SecondNum, "Result for MatNo before swapped", JOptionPane.INFORMATION_MESSAGE);
        int swapper = FirstNum;
        FirstNum = SecondNum;
        SecondNum = swapper;
        JOptionPane.showMessageDialog(null,"MatNo after Swapped: "+FirstNum + SecondNum, "Result for MatNo before swapped", JOptionPane.INFORMATION_MESSAGE);

        //System.out.println("Number after swapped: " + FirstNum + SecondNum);
    }
}
