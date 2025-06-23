package Java_Basics.Enum_;

enum VehicleType {
    CAR, BIKE, TRUCK, BUS
}
public class e3 {
    public static void main(String[] args) {
        VehicleType v = VehicleType.BIKE; // ধরুন আমরা BIKE ব্যবহার করছি

    switch (v) {
    case CAR:
                System.out.println("Car ");
                break;
    case BIKE:
                System.out.println("Bike");
                break;
       default:
                System.out.println("Unknown vehicle.");
        }
    }
}

