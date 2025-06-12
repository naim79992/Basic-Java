package Java_Basics.Enum_;

enum VehicleType1 {
    CAR(500000), BIKE(150000), TRUCK(1200000), BUS(800000);
    private final int price;  // instance variable

    // Constructor
    VehicleType1(int price) {  this.price = price; }

    public int getPrice1() {return price; } // Getter method
}

public class e4 {
    public static void main(String[] args) {
        for (VehicleType1 v : VehicleType1.values()) {
            System.out.println(v.name() + " price: " + v.getPrice1() + " Tk");
        }
    }
}


