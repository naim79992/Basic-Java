class Student {  
    String name;  
    int age;  

    Student(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  

    void display() {  
        System.out.println(name + " - " + age);  
    }  
}

public class ArrClass {  
    public static void main(String[] args) {  
        // Array of Student Objects  
        Student[] students = new Student[3];  

        // Object Creation  
        students[0] = new Student("Amit", 21);  
        students[1] = new Student("Borsha", 22);  
        students[2] = new Student("Chinmoy", 23);  


        // Display Data(for each loop)  
        for (Student s : students) {  
            s.display();  
        } 
        System.out.println(students[0]); //address
        System.out.println(students[0].name); //Amit

       /*
       Student s1 = new Student("Amit", 21);  
        Student s2 = new Student("Borsha", 22);  
        Student s3 = new Student("Chinmoy", 23);  

        students[0] = s1;  
        students[1] = s2;  
        students[2] = s3; 
        */    
    }  
}
