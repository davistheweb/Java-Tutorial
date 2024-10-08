//package src;

import java.util.Scanner;

public class FareCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the person's age");
        int age = read.nextInt();
        double fare = 0.00;

        if(age < 12){
            fare = 10.00;
        } else if (age <= 18) {
            fare = 15.00;
        } else if (age <= 25) {
            fare = 20.00;
        } else if (age <= 60){
            fare = 25.00;
        } else{
            fare = 20.00;
        }
        System.out.println("The fare amount is " + fare);
    }
}
