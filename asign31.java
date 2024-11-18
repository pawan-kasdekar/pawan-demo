
// Class to demonstrate zero-argument constructor
class Student {
    // Instance variables
    String name;
    int age;

    // Zero-argument constructor
    public Student() {
        // Assigning default values
        name = "Unknown";
        age = 0;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class asign31 {
    public static void main(String[] args) {
        // Creating an object using the zero-argument constructor
        Student student1 = new Student();

        // Displaying details of the student
        student1.display();
    }
}
