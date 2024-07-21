//package src;
import java.util.Scanner;
public class WhileLoopExample {
    public static void main(String[] args) {
    int unit;
    int sum = 0;
    Scanner readInput = new Scanner(System.in);

    System.out.print("Enter an integer value: ");
    unit = readInput.nextInt();

    while(unit != 0){
        sum += unit;
        System.out.println("Enter an integer value or '0' to quit");
        unit = readInput.nextInt();
    }
        System.out.println("The Sum is:"+ sum);
    }
}
