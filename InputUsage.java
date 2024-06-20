import java.util.Scanner;

public class InputUsage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        //System.out.println("Hello " +name+" How are you doing");
        int age = input.nextInt();
        System.out.print("Which sport is your favourite?: ");
        input.nextLine();
        String FavouriteSport = input.nextLine();
        String checkAge = null;
        if (age >= 30) {
            checkAge = "Oldest";
        } else if (age >= 20) {
            checkAge = "Older";
        } else if (age <= 20) {
            checkAge = "Younger";
        }
        System.out.println("Hello " + name + ", You are " + age + " Years " + checkAge + " And your favourite sport is" + FavouriteSport);
    }
}