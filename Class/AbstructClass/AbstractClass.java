package Java_Basics.Class.AbstructClass;


// Can't create obj of abstract class but can create ref var of 
// 100% abstraction by interface, partial abstraction by abstract class
public abstract class AbstractClass {
    // Abstract method (must be implemented by the subclass)
    public abstract void displayMessage();

    public static void main(String[] args) {
/////////// Can't create obj of Abstract Class, can create ref var using subclass
        AbstractClass obj1 = new Sub();
        obj1.displayMessage();
    }
}

class Sub extends AbstractClass {
    @Override
    public void displayMessage() {
        System.out.println("Hello from Sub!");
    }
}
