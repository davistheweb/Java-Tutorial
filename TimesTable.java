// Work done by Isaac Emmanuel chinweolu, MatNo: 22/5868
public final class TimesTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.println("Mat No last digits = 68");
        for(int i = 68; i >=1; i--){
            System.out.println("Multiplication table for "+ i + "\n");
            for(int j = 68; j>=1; j--){
                System.out.println(i + "x" + j +"=" + i*j);
            }

        }
    }
}
