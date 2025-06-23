package Java_Basics.Constructors;

public class NoArgumentConstructor {
    int a;
    String b;

    public NoArgumentConstructor() {
        a = 10;
        b = "Hello";
    }

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b);
    }

    public static void main(String[] args) {
        NoArgumentConstructor obj = new NoArgumentConstructor();
        obj.displayValues();
    }
}
