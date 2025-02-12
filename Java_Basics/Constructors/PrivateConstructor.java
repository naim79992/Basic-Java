package Java_Basics.Constructors;

public class PrivateConstructor {
    int a;
    String b;

    private PrivateConstructor() {
        a = 10;
        b = "Hello";
    }

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b);
    }

    public static void main(String[] args) {
        //Private constructor can not be accessed from outside the class
        PrivateConstructor obj = new PrivateConstructor();
        obj.displayValues();
    }
}
