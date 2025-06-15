package Java_Basics.Threads;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread running on: " + Thread.currentThread().getName());
    }
}
public class runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.run(); //main thread will exicute it
        t1.start();//new thread will exicute run method.
    }
}
