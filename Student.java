import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String email;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name:  \n");
        String name = input.nextLine();
        student.setName(name);

        System.out.println("Enter student age: ");
        int age = input.nextInt();
        student.setAge(age);
        input.nextLine();

        System.out.println("Enter student email: ");
        String email = input.nextLine();
        student.setEmail(email);

        // Display results
        System.out.println("\nName: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Email: " + student.getEmail());
    }
}
