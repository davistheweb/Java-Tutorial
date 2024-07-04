package src;

public class MultiTableW_FrLoop {
    public static void main(String[] args) {
        System.out.println("Multiplication Table.");
        System.out.println("---------------------");
        for(int i = 1; i<=12; i++){
            System.out.println("Multiplication Table for "+i);
            System.out.println(" ");
            for(int j = 1; j<= 12; j++){
                System.out.println(i+ "x" +j +"=" + i*j);
            }
        }
    }
}
