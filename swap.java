public class swap {
    public static void main(String[] args) {
        // Swapping variables in Java goes this way
        //Initialize an empty variable
        String emptyVar = null;
        String FirstVar = "John";
        String SecondVar = "James";
        //Swapping values
        emptyVar = SecondVar;
        SecondVar = FirstVar;
        FirstVar = emptyVar;
        System.out.println("FirstVar is:"+FirstVar);
        System.out.println("SecondVar is: "+SecondVar);
    }
}
