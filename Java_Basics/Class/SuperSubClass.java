package Java_Basics.Class;
// j class k kew extend kore ni : public class classname extends Object{}
public class SuperSubClass {
    int a;
    String b;

    public SuperSubClass() {
        a = 10;
        b = "Hello";
    }
}

class SubClass extends SuperSubClass {
    int c;

    public SubClass() {
        super();
        c = 20;
    }

    public void display() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
