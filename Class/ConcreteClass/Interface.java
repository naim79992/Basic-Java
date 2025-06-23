package Java_Basics.Class.ConcreteClass;

interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}

public class Interface {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(100.0);

        Payment payment2 = new PayPalPayment();
        payment2.processPayment(200.0);
    }
}

