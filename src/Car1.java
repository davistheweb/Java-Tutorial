//package src;

public class Car1 {

    double mileage;
    int price;
    int doors;
    public void carStart(){
        System.out.println("Car Started");
    }

    public void carShutOff(){
        System.out.println("Car engine offed");
    }

    public static void main(String[] args) {
        Car1 benz = new Car1();
        benz.mileage = 12.34;
        benz.price = 10000;
        benz.doors = 1;
        System.out.println("Benz Has "+ benz.doors + " doors");
        System.out.println("Benz is sold for " + benz.price + " dollars");
        System.out.println("The mileage is "+ benz.mileage);

        benz.carStart();
        benz.carShutOff();

    }
}
