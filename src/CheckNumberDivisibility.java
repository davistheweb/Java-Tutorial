//package src;

import java.util.Scanner;

public class CheckNumberDivisibility {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter a number to check it's divisibility by 5 or 11 : ");
        int number = readInput.nextInt();
        if(number % 11 == 0 && number % 5 == 0){
            System.out.println("The given number "+"("+number+")"+ " is divisible by 5 and 11");
        } else if (number % 11 == 0) {
            System.out.println("The given number "+"("+number+")"+ " is divisible by 11");
        } else if (number % 5 == 0) {
            System.out.println("The given number "+"("+number+")"+ " is divisible by 5");
        } else {
            System.out.println("The given number "+"("+number+")"+ " is not divisible by 5 and 11");
        }
        readInput.close();
    }
}