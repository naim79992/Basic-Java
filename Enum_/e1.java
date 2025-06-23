package Java_Basics.Enum_;

enum VehicleType {
    CAR, BIKE, TRUCK, BUS
}
public class e1 {
    public static void main(String[] args) {
        // .values() দিয়ে enum constant গুলোকে array তে নেওয়া
        VehicleType[] vehicleArray = VehicleType.values();

 for (VehicleType v : vehicleArray) { System.out.println(v+" "+v.ordinal()); } //ordinal=idx
    }
}

