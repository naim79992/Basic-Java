package Java_Basics.Exception_Handeling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TryWithResources {

    // Traditional way with finally block
    public static void traditionalTryCatchFinally() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name (traditional): ");
            String name = br.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Manual close needed, error-prone
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Modern way with try-with-resources (Java 7+)
    public static void tryWithResource() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name (try-with-resources): ");
            String name = br.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        traditionalTryCatchFinally();
        System.out.println(); // spacing
        tryWithResource();
    }
}
