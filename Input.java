import java.util.*;
public class Input{
    public static void main(String[] args) {
        int a = 73;
        int b = 15;

        // Swapping without a third variable using XOR
        a = a ^ b;  // a becomes 30 (XOR operation on 10 and 20)
        b = a ^ b;  // b becomes 10 (30 XOR 20)
        a = a ^ b;  // a becomes 20 (30 XOR 10)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}