package Java_Basics.Exception_Handeling;

// Step 1: Custom Checked Exception create
class UnderageEmployeeException extends Exception {
    public UnderageEmployeeException(String message) {
        super(message);
    }
}


// Step 2: Employee class — exception ducking করে
class Employee {
    public void setAge1(int age) throws UnderageEmployeeException {
        if (age < 18) {
            throw new UnderageEmployeeException("Employee must be 18+ years old.");
        }
        System.out.println(" Valid age set: " + age);
    }
}



// Step 3: Caller method — exception handle করে
public class ExceptionDucking {
    public static void main(String[] args) {
        Employee emp = new Employee();

        try {
            emp.setAge1(16); // will give Exception 
        } catch (UnderageEmployeeException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        // Success Case
        try {
            emp.setAge1(22);
        } catch (UnderageEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
