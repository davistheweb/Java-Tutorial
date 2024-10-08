import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n){
        if(n == 0){
                return 1;
            }else{
                return n *getFactorial(n -1);
            }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number to get it's factorial: ");
        int num = read.nextInt();
        System.out.println("The Factorial of " +num + " is "+ getFactorial(num));
    }
}
