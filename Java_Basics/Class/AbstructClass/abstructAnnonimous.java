package Java_Basics.Class.AbstructClass;

// Abstract + Anonymous Class: 
abstract class Vehicle {
    abstract void run();
    void fuelType() {
        System.out.println("Uses fuel");
    }
}
public class abstructAnnonimous {
    public static void main(String[] args) {
        // Anonymous Inner Class implementing the abstract class
        Vehicle car = new Vehicle() {
            @Override
            void run() {
                System.out.println("Car is running anonymously");
            }
        };
        car.run();       // Outputs: Car is running anonymously
        car.fuelType();  // Outputs: Uses fuel
    }
}
