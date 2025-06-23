package Java_Basics.Class.NestedClass.StaticNestedClass;

public class ObjectTest1 {
    static class OuterClass {

        int instanceVariable = 10;
        static int classVariable = 20;

        // Static nested class
        private static class NestedClass {
            public void print() {
                // Accessing the static class variable of OuterClass
                System.out.println(classVariable); 
            }
        }

        // Method that creates an instance of the static nested class
        public void display() {
            NestedClass nestedObj = new NestedClass();
            nestedObj.print(); // Calls the print method of NestedClass
        }
    }

    public static void main(String[] args) {
        OuterClass outerClassObj = new OuterClass();
        outerClassObj.display(); 

    }
}
