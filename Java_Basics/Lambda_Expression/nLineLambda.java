package Java_Basics.Lambda_Expression;

@FunctionalInterface
interface Vehicle2 {
    void run(int speed, int gear); 
}

public class nLineLambda {
    public static void main(String[] args) {
        Vehicle2 car = (speed, gear) -> {
            System.out.println("Starting the car...");
            System.out.println("Car speed: " + speed + " km/h");
            System.out.println("Gear engaged: " + gear);
            System.out.println("Driving smoothly!\n");
        };

        car.run(80, 3);
        car.run(120, 5);
    }
}

