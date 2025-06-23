package Java_Basics.Method;

public class FinalMethod {
    // This is a final method. It cannot be overridden by subclasses.
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }
    // Subclass attempting to override the final method
    public static class SubClass extends FinalMethod {
        // Uncommenting the below method will cause a compilation error
        // because displayMessage() is final in the superclass.
        /*
        @Override
        public void displayMessage() {
            System.out.println("Attempting to override the final method.");
        }
        */
    }
    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        obj.displayMessage(); // Calling the final method
    }
}
