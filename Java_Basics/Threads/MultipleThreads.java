package Java_Basics.Threads;

class A extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start(); // Thread-1
        b.start(); // Thread-2
    }
}
