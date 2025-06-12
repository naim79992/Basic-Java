package Java_Basics.Exception_Handeling;

// Custom Exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class ExceptionHandle {
    public static void main(String[] args) {

        // 1. NumberFormatException handled
        try {
            String salaryInput = "fifty thousand"; // ভুল ইনপুট
            int salary = Integer.parseInt(salaryInput); // exception হবে
            System.out.println("Salary: " + salary);
        } catch (NumberFormatException e) {
            System.out.println("✘ Invalid salary format! Please enter a number.");
        } finally {
            System.out.println("✔️ Salary input process completed.\n");
        }

        // 2. ArithmeticException handled
        try {
            int totalTask = 10;
            int completedTask = 0;
            int efficiency = totalTask / completedTask;
            System.out.println("Efficiency: " + efficiency);
        } catch (ArithmeticException e) {
            System.out.println("✘ Division by zero! Cannot calculate efficiency.");
        } finally {
            System.out.println("✔️ Efficiency check completed.\n");
        }

        // 3. NullPointerException handled
        try {
            String bonusInput = null;
            int bonus = Integer.parseInt(bonusInput);  // NullPointerException
            System.out.println("Bonus: " + bonus);
        } catch (NullPointerException e) {
            System.out.println("✘ Bonus null ছিল। একটা মান দিন।");
        } catch (NumberFormatException e) {
            System.out.println("✘ Bonus format ভুল। সংখ্যা দিন।");
        } catch (Exception e) {
            System.out.println("✘ কিছু একটা ভুল হয়েছে: " + e.getMessage());
        } finally {
            System.out.println("✔️ Bonus processing শেষ। ধন্যবাদ।\n");
        }

        // 4. Custom Exception handled
        try {
            int salary = -10000;  // Invalid
            if (salary < 0) {
                throw new InvalidSalaryException("✘ Salary can't be negative!");
            }
            System.out.println("Valid salary: " + salary);
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("✔️ Custom salary validation done.\n");
        }
    }
}
