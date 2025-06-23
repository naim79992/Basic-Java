package Java_Basics.Class;

public class Public {
    public static void demonstrateVar() {
        var message = "This is a message using var.";
        var number = 10;
        var list = java.util.List.of("one", "two", "three");

        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("List: " + list);
    }
    public static void main(String[] args) {
        System.out.println("This is a public class.");
        demonstrateVar();
    }
}
