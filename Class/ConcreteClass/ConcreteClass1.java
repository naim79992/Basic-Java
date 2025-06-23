package Java_Basics.Class.ConcreteClass;
//interface is like a blueprint for classes. It only contains abstract methods 
//that must be implemented by any class that uses the interface.

//4. Concrete cls can be child of Interface
public class ConcreteClass1 {
    public static void main(String[] args) {
        Payment payment11 = new CreditCardPayment();//go to interface.java
        payment11.processPayment(100.0);

        Payment payment22 = new PayPalPayment();
        payment22.processPayment(200.0);
    }
}
