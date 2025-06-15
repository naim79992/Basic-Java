package Java_Basics.Threads;

public class mainThread {
      public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        
        for(int i=1;i<5;i++){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         System.out.println(1);
    }
    }
}
