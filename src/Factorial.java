package src;

import java.util.Scanner;

public class Factorial {
     int number;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number to get it's factorial: ");
        int n = read.nextInt();
        int result = 1;
        int number = n;
        while(n >0){
            result *= n;
            n--;
        }
        System.out.println("The factorial of " + number +" is " + result);

    }
}
