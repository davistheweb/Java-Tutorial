package src;

public class Var {
public static void main(String[] args){
    int age = 18; // Defined an integer variable "age" with a given value "18"
    System.out.println(age);
    age = 20; // changed the value of age after the first printing
    System.out.println(age);
    // Declaring multiple integer variable in one line goes as>>
    int FirstMultiInt = 10, SecondMultiInt = 20, RdInt = 50;
    System.out.println(FirstMultiInt);
    System.out.println(SecondMultiInt);
    System.out.println(RdInt);
    //Coping of variable
    //Example
    int originVar = 40;
    int newCopy = originVar;
    System.out.println(newCopy);

    byte AcctBal = 40;
    long viewsCount = 392_192_348_29L; // L is a suffix used to specifies that the data is a 'long' datatype because java usually sees it as "int" datatype

    System.out.println(viewsCount);
    float price = 45.04F;
    char character = 'M';
    System.out.println(character);
    boolean IsMale = true;
    boolean IsAdult = false;
}
}
