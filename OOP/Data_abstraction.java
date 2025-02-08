package OOP;

abstract class Vehicle {
    private String engineStatus = "Off"; // Hidden data (Encapsulation)

    abstract void start(); // Abstract method

    void stop() {
        engineStatus = "Off"; // Internal state change
        System.out.println("Vehicle is stopping...");
    }

    // Encapsulated method to get engine status
    String getEngineStatus() {
        return engineStatus;
    }

    // Protected method to change engine status (Only accessible in subclass)
    protected void setEngineStatus(String status) {
        this.engineStatus = status;
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        setEngineStatus("On"); // Updating internal state
        System.out.println("Car is starting...");
    }
}

public class Data_abstraction {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        System.out.println("Engine Status: " + myCar.getEngineStatus()); // Accessing limited info
        myCar.stop();
        System.out.println("Engine Status: " + myCar.getEngineStatus());
    }
}

