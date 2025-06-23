package Java_Basics.Threads;

class my extends Thread{
    public void fun(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class mainThread2{
    public static void main(String[] args){
        my m1=new my();
        m1.fun();
    }
} 