package Java_Basics.Constructors;

public class DefaultConstructor {
    int a;
    String b;

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b);
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println("Default value of int: " + obj.a);
        System.out.println("Default value of String: " + obj.b);

        // Modify the values
        obj.a = 10;
        obj.b = "Hello";

        // Display the modified values
        obj.displayValues();
    }
}
