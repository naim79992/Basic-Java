package Java_Basics.IO;

import java.io.IOException;
//just can read one char
public class read {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a digit (0-9): ");
        int ch = System.in.read(); // reads one character and returns ASCII

        int number = ch - '0'; // convert ASCII to digit
        System.out.println("You entered number: " + number);
    }
}

