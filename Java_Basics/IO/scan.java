package Java_Basics.IO;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // integer input

        System.out.println("Welcome " + name + ", Age: " + age);

        sc.close(); // Best practice
    }
}

