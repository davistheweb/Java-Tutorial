//package src;
import java.util.Scanner;
public class DoWhLoop {
    public static void main(String[] args) {
        int unit;
        int sum = 0;
        Scanner readInput = new Scanner(System.in);
        do{
            System.out.println("Enter an integer value or '0' to quit!: ");
            unit = readInput.nextInt();
            sum +=unit;
        } while(unit !=0);
        System.out.println("The sum is: "+ sum);
    }
}
