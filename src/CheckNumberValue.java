package src;

import java.util.Scanner;

public class CheckNumberValue {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter a number to check if it is positive or negative: ");
        int number = readInput.nextInt();
        if(number < 0){
            System.out.println("The given number "+ "(" + number +") " +"is negative!");
        }
        else {
            System.out.println("The given number "+ "(" + number +") " +"is positive");
        }
    }
}