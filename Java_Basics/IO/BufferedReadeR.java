package Java_Basics.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReadeR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine(); // string input

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // integer input after parsing

        System.out.println("Welcome " + name + ", Age: " + age);

        br.close(); // Best practice though optional for System.in
    }
}

