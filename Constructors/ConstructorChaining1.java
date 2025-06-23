package Java_Basics.Constructors;
//hidden super kaaj kore na parametarized constructor er khetre.
class Parent {
    int a;
    String b;

    // Default constructor
    public Parent() {
        this(10, "Hello"); // Calls the parameterized constructor of Parent
        System.out.println("Parent Default Constructor");
    }

    // Parameterized constructor
    public Parent(int a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("Parent Parameterized Constructor: a = " + a + ", b = " + b);
    }
}

class ConstructorChaining2 extends Parent {
    int c;

    // Default constructor of Child
    public ConstructorChaining2() {
        this(30); // Calls parameterized constructor of ConstructorChaining2
        System.out.println("ConstructorChaining2 Default Constructor");
    }

    // Parameterized constructor of Child
    public ConstructorChaining2(int c) {
        super(20, "World"); // Calls Parent's parameterized constructor
        this.c = c;
        System.out.println("ConstructorChaining2 Parameterized Constructor: c = " + c);
    }
}

public class ConstructorChaining1 {
    public static void main(String[] args) {
        System.out.println("Creating obj1:");
        ConstructorChaining2 obj1 = new ConstructorChaining2();  // Calls default constructor of ConstructorChaining2
        
        System.out.println("\nCreating obj2:");
        ConstructorChaining2 obj2 = new ConstructorChaining2(40); // Calls parameterized constructor of ConstructorChaining2
    }
}
