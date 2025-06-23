package Java_Basics.Threads;

class Aa {
    void show() {
        System.out.println("A class method");
    }
}

// Runnable implement করে Thread logic
class MyThread1 extends Aa implements Runnable {
    String name;

    MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Thread লজিক
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(500); // 0.5 second delay
            } catch (InterruptedException e) {
                System.out.println(name + " got interrupted!");
            }
        }
    }
}

public class runnable2 {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1("Thread-1");
        MyThread1 obj2 = new MyThread1("Thread-2");

        obj1.show(); // A class method call

        // Runnable হিসেবে obj1 ও obj2 কে Thread-এ wrap করা হচ্ছে
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Thread শুরু
        t1.start();
        t2.start();
    }
}
