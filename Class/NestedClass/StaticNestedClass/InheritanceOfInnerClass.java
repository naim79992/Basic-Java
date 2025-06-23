package Java_Basics.Class.NestedClass.StaticNestedClass;
//Inherit static inner class from other class
class StaticInnerInherit {
    static class Nested {
        void display() {
            System.out.println("This is a static nested class.");
        }
    } 
}

public class InheritanceOfInnerClass extends StaticInnerInherit.Nested { // Inheriting static nested class
    void extendedDisplay() {
        System.out.println("This is an extended static nested class.");
    }
    public static void main(String[] args) {
        StaticInnerInherit.Nested nested = new StaticInnerInherit.Nested();
        nested.display();
        
        InheritanceOfInnerClass extendedNested = new InheritanceOfInnerClass();
        extendedNested.extendedDisplay();
        extendedNested.display();
    }
}
