package Java_Basics.Method;

public class StaticMethod {
    public static int sum(int a, int b) {
        return a + b;
    }

    static int sm = 0;
    public static int sum1(int a, int b, int c, int d) {
        sm += a + b + c + d;
        return sm;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3: " + sum(2, 3));
        System.out.println("Sum of 1, 2, 3 and 4: " + sum1(1, 2, 3, 4));
        System.out.println("Static member sm after sum1: " + sm);
        System.out.println("Sum of 1, 2, 3 and 4: " + sum1(1, 2, 3, 4));
    }
}
