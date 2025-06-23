package Java_Basics.Class.Generic.Wildcard;
import java.util.ArrayList;
import java.util.List;

// Superclass
class Vehicle {
    void move() {System.out.println("Vehicle is moving");}
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void move() {System.out.println("Car is moving");}
}

// Subclass 2
class Bus extends Vehicle {
    @Override
    void move() {System.out.println("Bus is moving");}
}

// Class to handle writing of vehicle information
class Write {
    public void writeVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}

class Write1 {
    public void writeVehicles(List<? extends Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}

// Main class with wildcards
public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bus());

        Write w1 = new Write();
        w1.writeVehicles(vehicles);

        
        List<Car> cars = new ArrayList<>();
        //Can't
        //w1.writeVehicles(cars);
        //son: upper bound
        Write1 w2 = new Write1();
        w2.writeVehicles(cars);

        //lower bound(super)
        List<? super Car> vehicles1 = new ArrayList<>();
        vehicles1.add(new Car());
    }
}
// Output:
// Car is moving
// Bus is moving
