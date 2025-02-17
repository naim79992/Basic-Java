package Java_Basics.Class.AnnonimousClass;

abstract class Person {
    abstract void display();
}

public class AnnonimousClass2 {
    public static void main(String[] args) {
        // Creating an anonymous class that extends the class Person
        Person person = new Person() {
            @Override
            public void display() {
                System.out.println("Anonymous Class Example");
            }
        };
        person.display();
    }
}
// Output: Anonymous Class Example

