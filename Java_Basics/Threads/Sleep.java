package Java_Basics.Threads;

class A extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            
            try {
                System.out.println("hi");
                Thread.sleep(1000); // 1 sec delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000); //1 sec delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Sleep {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a.start(); // Thread-1
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        b.start(); // Thread-2
    }
}
