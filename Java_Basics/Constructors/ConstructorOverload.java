package Java_Basics.Constructors;

public class ConstructorOverload {
    int a;
    String b;

    public ConstructorOverload() {
        a = 10;
        b = "Hello";
    }

    public ConstructorOverload(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b);
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        obj1.displayValues();

        ConstructorOverload obj2 = new ConstructorOverload(20, "World");
        obj2.displayValues();
    }
}
