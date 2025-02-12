package Java_Basics.Constructors;

public class ConstructorChaining { //can done using this & super
    int a;
    String b;

    public ConstructorChaining() {
        this(10, "Hello");
    }

    public ConstructorChaining(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b);
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
        obj.displayValues();
    }
}
