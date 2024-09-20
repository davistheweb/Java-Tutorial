public class StaticClassType {
    public static void main(String[] args) {
        cat mycat = new cat();
        mycat.meow();
    }
}

class cat{
    String name;
    String c;

    public void meow(){
        System.out.println("hey");
    }
}
