package Java_Basics.Lambda_Expression;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);  // দুইটা int parameter নিয়ে int return করে
}

public class withReturn {
    public static void main(String[] args) {
        // Lambda expression with return value
        Calculator calc = (a, b) -> a + b; 
       //no-lamda:  Calculator calc = new Calculator() { public int sum(int a, int b) {return a + b;}};
        int result = calc.sum(10, 20);
        System.out.println("Sum is: " + result);
    }
}

