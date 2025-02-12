package Java_Basics.Constructors;

public class ParameterizeConstructor {
    int a;
    String b;

    public ParameterizeConstructor(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void displayValues() {
        System.out.println("Value of int: " + a);
        System.out.println("Value of String: " + b);
    }

    public static void main(String[] args) {
        ParameterizeConstructor obj = new ParameterizeConstructor(10, "Hello");
        obj.displayValues();
    }
}
