package Java_Basics.Exception_Handeling;

import java.io.*;  // IOException এর জন্য
import java.sql.*; // SQLException এর জন্য

// Custom class to show different exception types
public class ExceptionHierarchy {

    public static void main(String[] args) {

        //  1. Checked Exception (Compile Time)
        try {
            FileReader fr = new FileReader("non_existing_file.txt"); // File নাই
        } catch (IOException e) {
            System.out.println("✔️ Checked Exception ধরেছি: " + e.getClass().getSimpleName());
        }

        // 2. Unchecked Exception (Runtime)
        try {
            String data = null;
            System.out.println(data.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("✔️ Unchecked Exception ধরেছি: " + e.getClass().getSimpleName());
        }

        // 3. ArithmeticException (Runtime)
        try {
            int result = 100 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("✔️ Runtime Exception ধরেছি: " + e.getClass().getSimpleName());
        }

        // 4. Error (JVM level - normally not handled, but can be caught)
        try {
            throw new OutOfMemoryError("জায়গা শেষ");
        } catch (OutOfMemoryError e) {
            System.out.println("⚠️ JVM Error ধরেছি (সাধারণত handle করা হয় না): " + e.getClass().getSimpleName());
        }

        // 5. SQLException (Checked Exception)
        try {
            throw new SQLException("DB connection failed");
        } catch (SQLException e) {
            System.out.println("✔️ Checked Exception ধরেছি: " + e.getClass().getSimpleName());
        }

        // Summary Print
        System.out.println("\n🧠 Exception Hierarchy Recap:");
        System.out.println("Throwable");
        System.out.println("├── Error (e.g., OutOfMemoryError)");
        System.out.println("└── Exception");
        System.out.println("    ├── Checked Exception (e.g., IOException, SQLException)");
        System.out.println("    └── Unchecked/RuntimeException (e.g., NullPointerException, ArithmeticException)");
    }
}
