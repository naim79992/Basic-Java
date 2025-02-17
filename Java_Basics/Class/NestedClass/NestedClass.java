package Java_Basics.Class.NestedClass;

public class NestedClass {
    class InnerClass {
        void display() {
            System.out.println("This is an inner class");
        }
    }
    static int a=120;
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class"+a);
        }
    }

    public static void main(String[] args) {
        NestedClass outer = new NestedClass();
        NestedClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        NestedClass.StaticNestedClass staticNested = new NestedClass.StaticNestedClass();
        staticNested.display();
    }
}
