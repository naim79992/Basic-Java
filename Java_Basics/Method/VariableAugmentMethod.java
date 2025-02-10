package Java_Basics.Method;

public class VariableAugmentMethod {
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
        }
        public static float sum1(float a,int... numbers) {
        float total = a;
        for (int number : numbers) {
            total += number;
        }
        return total;
        }

        public static void main(String[] args) {
        System.out.println(sum(1, 2, 3)); // Output: 6
        System.out.println(sum(10, 20));  // Output: 30
        System.out.println(sum(5));       // Output: 5
        System.out.println(sum());        // Output: 0

        System.out.println(sum1(2.5f, 10, 20)); // Output: 32.5
    }
}
