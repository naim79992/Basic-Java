package Java_Basics.Exception_Handeling;

// File: ThrowKeywordDemo.java

// Employee.java
class Employee {
    private int age;

    public void setAge(int age) {
        if (age < 18) {
            // ✅ Throw: manually exception ছুঁড়ছি
            throw new IllegalArgumentException("Employee must be at least 18 years old.");
        }
        this.age = age;
        System.out.println("✔️ Valid Age Set: " + age);
    }
}

// Bank.java
class Bank {
    public void withdraw(int amount) {
        if (amount < 0) {
            // ✅ Throw: manually exception ছুঁড়ছি
            throw new ArithmeticException("Withdraw amount can't be negative");
        }
        System.out.println("✔️ Withdraw successful: " + amount);
    }
}

// Main.java
public class ThrowKeyword {
    public static void main(String[] args) {

        // ✅ Example 1: Employee Age Checker
        Employee emp = new Employee();
        try {
            emp.setAge(16); // exception ছুঁড়বে
        } catch (IllegalArgumentException e) {
            System.out.println("✘ Exception: " + e.getMessage());
        }

        // ✅ Example 2: Bank Withdraw Checker
        Bank bank = new Bank();
        try {
            bank.withdraw(-500); // exception ছুঁড়বে
        } catch (ArithmeticException e) {
            System.out.println("✘ Exception: " + e.getMessage());
        }

        // ✅ Success Case
        try {
            emp.setAge(25);
            bank.withdraw(1000);
        } catch (Exception e) {
            System.out.println("✘ Something went wrong: " + e.getMessage());
        }
    }
}

