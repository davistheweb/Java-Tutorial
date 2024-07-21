// Work done by Isaac Emmanuel chinweolu, MatNo: 22/5868
import java.util.Scanner ; 
public class testAdmissionstatus
{
public static void main(String [] args)
{
Scanner read = new Scanner (System.in) ;
System.out.println("Calculate Student Admission status.");
String admissionstatus = read.nextLine();
switch (admissionstatus)
{
case "Computer Science":
System.out.println("Computer Science = 200");
break;
case "Medicine and Surgey":
System.out.println(" Medicine and Surgey = 300");
break;
case "Law":
System.out.println(" Law= 250");
break;
 default:
System.out.print ("invalid number");
break;
}
}
}