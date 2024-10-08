
import java.util.Scanner;
import javax.swing.JOptionPane;
public class testGreaterNum {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.println("Compare the age of 3 students");
        System.out.print("Enter the age of the students: ");
        int age1 = readInput.nextInt();
        int age2 = readInput.nextInt();
        int age3 = readInput.nextInt();

        if (age1 > age3){
            if (age2 > age3) {
                System.out.println("Age1 and age 2 are greater than age 3");
            }
            else{
                System.out.println("Age1 is less than or equal to age 2");
            }
        }
        else{
            System.out.println("Age3 is the greatest");
        }

        JOptionPane.showMessageDialog(null,"Helloworld");

        readInput.close();
    }
}
