package Java_Basics.Interface;

// Interface definition
interface Vehicle {
    int MAX_SPEED = 120;      // By default: public static final variable (constant)

       void run(); // abstract method(public abstract void run()) 

    // Static method (Java 8+)
    static void info1() {
        System.out.println("Vehicle interface, max speed is " + MAX_SPEED);
    }
}

// Implementing class
class Car implements Vehicle {
    // Must override abstract method
    public void run() {
        System.out.println("Car is running smoothly.");
    }
}

public class i {
    public static void main(String[] args) {
        Vehicle v = new Car();        // Interface reference pointing to Car object
        v.run(); // Call abstract method (overridden in Car)
        Vehicle.info1();  // Call static method from interface using interface name

        // Access final variable from interface
        System.out.println("Maximum allowed speed: " + Vehicle.MAX_SPEED);
    }
}

