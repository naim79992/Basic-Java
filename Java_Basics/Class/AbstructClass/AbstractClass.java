package Java_Basics.Class.AbstructClass;
import Java_Basics.Class.ConcreteClass.ConcreteClass;
//#Can't create obj of abstruct class but can create ref var of 
//100% abstruction by interface, partial abstruction by abstruct class
public abstract class AbstractClass {
    // Abstract method (must be implemented by the subclass)
    public abstract void displayMessage();

    public static void main(String[] args) {
        // Creating an object of the concrete class
        ConcreteClass obj = new ConcreteClass();
        obj.displayMessage();
    }
}
