package Java_Basics.Class.Generic;
import java.util.*;

// Upper Bounded Generic (Only Number(INT,DOUBLE etc) & its subclasses allowed)
//the immediate superclass of Integer is Number, and the root superclass is Object.
class NumberBox<T extends Number> {  
    T value;
    NumberBox(T value) { this.value = value; }
    void displayValue() { System.out.println("Stored Value: " + value); }
}

// Lower Bounded Generic Method (Accepts Integer & its superclasses)
class NumberUtils {
    static void addIntegerToList(List<? super Integer> list) {  
        list.add(10);  // ✅ Can add Integer
        System.out.println("Updated List: " + list);
    }
}

// Multiple Bounds (Class + Interface)
interface Printable { 
    void printDetails();
}

class PrintableNumber<T extends Number & Printable> {  
    T value;
    PrintableNumber(T value) { this.value = value; }
    void displayInfo() {
        value.printDetails();
        System.out.println("Value: " + value);
    }
}

// Class implementing Printable interface
class CustomNumber extends Number implements Printable {
    private final int num;
    CustomNumber(int num) { this.num = num; }

    @Override
    public int intValue() { return num; }
    @Override
    public long longValue() { return num; }
    @Override
    public float floatValue() { return num; }
    @Override
    public double doubleValue() { return num; }
    @Override
    public void printDetails() { 
        System.out.println("CustomNumber: " + num);
    }
}

public class BoundedGenerics {
    public static void main(String[] args) {
        // Upper Bound Example
        NumberBox<Integer> intBox = new NumberBox<>(100);
        intBox.displayValue();

        NumberBox<Double> doubleBox = new NumberBox<>(10.5);
        doubleBox.displayValue();

        // Lower Bound Example
        List<Number> numberList = new ArrayList<>();
        NumberUtils.addIntegerToList(numberList);

        // Multiple Bounds Example
        CustomNumber myNum = new CustomNumber(50);
        PrintableNumber<CustomNumber> data = new PrintableNumber<>(myNum);
        data.displayInfo();
    }
}
