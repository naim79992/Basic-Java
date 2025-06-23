package Java_Basics.Exception_Handeling;

// Step 1: Custom Checked Exception (extends Exception)
class UnderageEmployeeException extends Exception {
    public UnderageEmployeeException(String message) {
        super(message);
    }
}

// Step 2: Custom Unchecked Exception (extends RuntimeException)
class InvalidSalaryException extends RuntimeException {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

//  Employee Class: use of custom checked exception
class Employee {
    private int age;
    private double salary;

    public void setAge(int age) throws UnderageEmployeeException {
        if (age < 18) {
            throw new UnderageEmployeeException("Employee must be at least 18 years old.");
        }
        this.age = age;
        System.out.println("Age set to: " + age);
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary can't be negative.");
        }
        this.salary = salary;
        System.out.println("Salary set to: " + salary);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Employee emp = new Employee();

        //  Handling Custom Checked Exception
        try {
            emp.setAge(16); // 'll be exception 
        } catch (UnderageEmployeeException e) {
            System.out.println("Caught Custom Checked Exception: " + e.getMessage());
        }

        //  Handling Custom Unchecked Exception
        try {
            emp.setSalary(-5000); // exception 
        } catch (InvalidSalaryException e) {
            System.out.println("Caught Custom Runtime Exception: " + e.getMessage());
        }

        //  Success Case
        try {
            emp.setAge(25);
            emp.setSalary(60000);
        } catch (UnderageEmployeeException e) {
            System.out.println("Age Exception: " + e.getMessage());
        }
    }
}


