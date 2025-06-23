package Java_Basics.Class.Generic;

public class GenericMethod {
    public static <T> void printArray(T a) { //return type er age <T> dite hobe
            System.out.println(a);
        }
        public static void main(String[] args) {
            printArray("Hello");
    }
}
