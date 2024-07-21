// Work done by Isaac Emmanuel chinweolu, MatNo: 22/5868
import java.util.Scanner;

class MatricNumber {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter the last two digits of your matric noumber");
        int MatNo = readInput.nextInt();
        int First_Num = MatNo/10;
        int Second_Num = MatNo%10;
        System.out.println("Matric Number before swapped is "+ First_Num + Second_Num);
        System.out.println("Matric Number After Swapped is " + Second_Num + First_Num);
    }
}
