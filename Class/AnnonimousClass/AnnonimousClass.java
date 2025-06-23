package Java_Basics.Class.AnnonimousClass;
//An inner class without a name =Annonimous class
//Annonimous class is used to override the method of a class/interface without creating any subclass
//Annonimous class is used to declare and instantiate a class at the same time
class Person {
    public void display() {
        System.out.println("Person Class");
    }
}

public class AnnonimousClass {
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
