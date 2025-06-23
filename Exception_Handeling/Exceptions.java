package Java_Basics.Exception_Handeling;

// ১. NullPointerException
class NullPointerDemo {
    static class Employee {
        String salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = null;
        // This will throw NullPointerException
        System.out.println(emp.salary.toString());
    }
}

// ২. ArithmeticException
class ArithmeticDemo {
    static class Employee {
        int totalTask = 10;
        int completedTask = 0;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        // This will throw ArithmeticException (division by zero)
        System.out.println(emp.totalTask / emp.completedTask);
    }
}

// ৩. NumberFormatException
class NumberFormatDemo {
    public static void main(String[] args) {
        String input = "ten thousand";
        // This will throw NumberFormatException
        int salary = Integer.parseInt(input);
        System.out.println(salary);
    }
}

// Custom Exception
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    public static void checkSalary(int salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary can't be negative");
        } else {
            System.out.println("Salary is valid: " + salary);
        }
    }

    public static void main(String[] args) {
        try {
            checkSalary(-5000);
        } catch (InvalidSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}