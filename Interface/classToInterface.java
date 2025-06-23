package Java_Basics.Interface;

interface Vehicle {
    void run();
}

// দ্বিতীয় Interface
interface Fuel {
    void refuel();
}

// একটি ক্লাস, যা দুইটি Interface implement করছে
class Car implements Vehicle, Fuel {
    public void run() {
        System.out.println("Car is running.");
    }

    public void refuel() {
        System.out.println("Car is refueling with petrol.");
    }
}

// Main class
public class classToInterface {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
        myCar.refuel();
    }
}
// class to class= extends
// class to interface= implements
// interface to interface= extends 

