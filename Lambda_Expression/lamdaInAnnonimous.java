package Java_Basics.Lambda_Expression;
//Lambda = shortcut (only for FUNCTIONAL INTERFACE)
@FunctionalInterface
interface Vehicle {
    void run();
}
public class lamdaInAnnonimous {
    public static void main(String[] args) {
// Anonymous fun using lambda expression
        Vehicle car = () -> System.out.println("Car.");
        car.run();
        // Vehicle car1=new Vehicle(){
        //        public void run(){System.out.println("Car...");}  
        // };
        // car1.run();
    }
}
