public class A {
    int b = 1;
    public A() {
        System.out.println("Constructor is called " + b);
    }

    public void display(){
    System.out.println("b = "+ b);
    }

    public static void main(String[] args) {
        A o1 = new A();A o2 = new A();
        o1.display();o2.display();
    }
}
