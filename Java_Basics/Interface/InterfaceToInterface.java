package Java_Basics.Interface;

interface Vehicle {
    void run();
}

interface ElectricVehicle extends Vehicle {
    void charge();
}

class Tesla implements ElectricVehicle {
    public void run() {
        System.out.println("Tesla is running silently.");
    }

    public void charge() {
        System.out.println("Tesla is charging.");
    }
}

public class InterfaceToInterface {
    public static void main(String[] args) {
        ElectricVehicle myTesla = new Tesla();
        myTesla.run();
        myTesla.charge();
    }
}