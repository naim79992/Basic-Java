package Java_Basics.Class.NestedClass.StaticNestedClass;
//Static nested class can access static members of outer class directly without creating object of outer class.
class OuterClass {
    static int instanceVariable = 10; // Made static
    static int classVariable = 20;

    static class NestedClass {
        public void print() {
            System.out.println(classVariable + instanceVariable); // Now valid
        }
    }}

public class ObjectTest {
    public static void main(String args[]) {
        OuterClass.NestedClass nestedObj = new OuterClass.NestedClass(); //***Note this line***
        nestedObj.print();
    }
}

