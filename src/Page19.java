package src;

import java.util.*;

public class Page19 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int age = myobj.nextInt();
        if (age >= 18)
            System.out.println("Congratulations, You can vote");
        else
            System.out.println("Oops! You have to wait for someone time to vote");
    }
}
