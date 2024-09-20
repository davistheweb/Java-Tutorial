//public class MethodExample {
//    public static void greetUser(){
//        String name = "Josiah";
//        System.out.println("Hello " + name + " Good morning");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The greet user method prints this below");
//        greetUser();
//    }
//}

import java.util.Scanner;

public class MethodExample {
    public static String greet(String name, String message){
        String greet = "Hello " + name + message;
        return greet;
        //String nam = "Josiah";
    }
//    public static void print(){
//        return 4;
//    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter name: ");
        String username  = read.nextLine();
        String greetText = ", Good morning";
        System.out.println(greet(username, greetText));
    }
}