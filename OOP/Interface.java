package OOP;

interface Vehicle1 {
    abstract void start();
}

class Car2 implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle1 myCar = new Car2();
        myCar.start(); // Output: Bark!
    }
}

