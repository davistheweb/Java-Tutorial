
import java.util.Scanner;
public class greaterThan {
    public static void main(String[] args){
        Scanner readUserInput = new Scanner(System.in);

        System.out.print("Enter the age of three Students to test their Max number: ");

        int a = readUserInput.nextInt(),
                b = readUserInput.nextInt(),
                c = readUserInput.nextInt();

        if (a>c)
            if (b>c)
                System.out.println("A is the greater or equal to b");
        else
                System.out.println("B is the greatest number");
        else
            System.out.println("C is the greatest number");

            readUserInput.close();
    }
}
