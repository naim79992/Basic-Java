package Java_Basics.Constructors;

class ParentClass {
    int a;
    String b;

    public ParentClass() {
        a = 10;
        b = "Hello";
    }

    public ParentClass(int a, String b) { //constructor overload
        this.a = a;
        this.b = b;
    }

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b+"\n");
    }
}
// Constructors can't be overridden because they are not inherited. 
// In a child class, the constructor name must be the same as the class name, 
// which prevents it from having the same name as the parent class constructor.
public class ConstructorCanNotOverride extends ParentClass {
    public ConstructorCanNotOverride() {
        //Default Constructor of ChildClass
        super(); // Calls ParentClass() constructor to initialize default values
    }

    public ConstructorCanNotOverride(int a, String b) {
        super(a, b); // Calls ParentClass(int a, String b) constructor to initialize with provided values
    }
    public ConstructorCanNotOverride(int a) {
        System.out.println("Value: " + a);
    }

    public static void main(String[] args) {
        ConstructorCanNotOverride obj1 = new ConstructorCanNotOverride();
        obj1.displayValues(); // Displays default values

        ConstructorCanNotOverride obj2 = new ConstructorCanNotOverride(20, "World");
        obj2.displayValues(); // Displays provided values

        ConstructorCanNotOverride obj3 = new ConstructorCanNotOverride(20);
    }
}
