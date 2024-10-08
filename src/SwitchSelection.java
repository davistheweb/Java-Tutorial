
import java.util.Scanner;
public class SwitchSelection {
    public static void main(String[] args) {
        Scanner readInputForDayNo = new Scanner(System.in);
        System.out.print("Enter any number of a day in a week: ");
        int DayNo = readInputForDayNo.nextInt();

        switch (DayNo){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                 System.out.println("Today is Wednesday");
                 break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
            default:
                System.out.println("Dear User!!, You have entered an invalid day number, you no **SABI** day numbers?");
                break;


        }
    }
}