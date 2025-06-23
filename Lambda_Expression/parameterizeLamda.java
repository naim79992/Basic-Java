package Java_Basics.Lambda_Expression;

////Lambda expression with two parameters
@FunctionalInterface
interface Vehicle2 {
void run(int speed, int gear);  // দুইটা parameter 
}
public class parameterizeLamda {
    public static void main(String[] args) {
    Vehicle2 car = (speed, gear) -> System.out.println("Car speed: " + speed + " km/h, in gear: " + gear);
        car.run(80, 3);
        car.run(120, 5);
    }
}

