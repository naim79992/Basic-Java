package Java_Basics.Constructors;

public class PrivateConstructor2 {
    private PrivateConstructor2() {
        // private constructor
    }

    public static PrivateConstructor2 createInstance() {
        return new PrivateConstructor2();
    }
}
class TestPrivateConstructor2 {
    public static void main(String[] args) {
        // to access private constructor, we use a static factory method
        PrivateConstructor2 instance = PrivateConstructor2.createInstance();
        System.out.println("Instance created: " + instance);
    }
}