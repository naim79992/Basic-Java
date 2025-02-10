package Java_Basics.Method;

abstract class Vehicle {
    abstract void startEngine();
    void stopEngine() {System.out.println("Engine stopped.");}
}

class Car extends Vehicle {
    void startEngine() {System.out.println("Car engine started.");}
}

public class AbstractMethod {
    public static void main(String[] args) {
        // You cannot create an instance of an abstract class
        // Vehicle myVehicle = new Vehicle(); // This will cause an error

        // You need to create a subclass that provides implementations for the abstract methods
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();
    }
}

