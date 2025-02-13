package Java_Basics.Class.ConcreteClass;

abstract class AbstractCls {
    int value;

    // Constructor in Abstract Class
    AbstractCls(int value) {
        this.value = value;
        System.out.println("AbstractClass Constructor: Value = " + value);
    }

    // Abstract method (must be implemented by subclass)
    abstract void display();
}
//4. it also can be extend abstract class
class ConcreteClass11 extends AbstractCls {
    // Constructor of ConcreteClass
    ConcreteClass11(int value) {
        super(value); // Calling AbstractClass constructor
        System.out.println("ConcreteClass Constructor");
    }

    // Implementing the abstract method
    @Override
    void display() {
        System.out.println("ConcreteClass Display Method");
    }
}

public class ConcreteClass2 {
    public static void main(String[] args) {
        ConcreteClass11 obj = new ConcreteClass11(10);
        obj.display();
    }
}
