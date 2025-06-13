package Java_Basics.Enum_;

enum VehicleType {
    CAR, BIKE, TRUCK, BUS
}

public class e2 {
    public static void main(String[] args) {
VehicleType[] vehicleArray = VehicleType.values();

 // enum constant যাচাই if-else দিয়ে
        for (VehicleType v : vehicleArray) {
            if (v == VehicleType.CAR) {
                System.out.println("This is a car.");
          } else if (v == VehicleType.BIKE) {
                System.out.println("This is a bike.");}
       else {System.out.println("Unknown vehicle.");}
        }
    }
}
