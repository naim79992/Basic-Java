package Java_Basics.Collection;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee("Naim", 25),
            new Employee("Tanim", 32),
            new Employee("Kamal", 45),
            new Employee("Rafi", 28),
            new Employee("Arif", 35)
        );

        // By using Stream API person with 30+ age 'll show Alphabetically
        List<String> result = empList.stream()
            .filter(emp -> emp.age > 30)               // 30+age
            .map(emp -> emp.name)                      // only name
            .sorted()                                  // alphabetically sort
            .collect(Collectors.toList());             // collect in list

        System.out.println("Age > 30: " + result);
    }
}
