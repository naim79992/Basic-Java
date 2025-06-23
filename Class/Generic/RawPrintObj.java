package Java_Basics.Class.Generic;
//Raw type- generic type na dile raw type hoy, ete j kono type er data rakha jay
//Raw type use korle type safety thake na
//compiler error kono var e rakhte gele oi var er type specify korte hobe
// Generic class
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
        System.out.println("Item set: " + item);
    }

    public T getItem() {
        return item;
    }
}

// Using raw type
public class RawPrintObj {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Raw type (no type parameter specified)
        @SuppressWarnings("rawtypes")
        Box rawTypeBox = new Box(); // Warning: Raw use of parameterized class 'Box'

        // You can add any type of object
        rawTypeBox.setItem("Hello"); // Works, but unsafe
        rawTypeBox.setItem(123);     // Also works, but unsafe
        //comment it to run the code
       String str = (String) rawTypeBox.getItem(); // May throw ClassCastException at runtime
       System.out.println(str);
    }
}
