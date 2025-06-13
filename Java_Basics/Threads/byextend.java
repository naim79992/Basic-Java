package Java_Basics.Threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
public class byextend{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Thread starts in run() method
}
}
