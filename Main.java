
// Class to demonstrate parameterized constructor
class Student {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects with parameterized constructor
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Displaying details of the students
        student1.display();
        student2.display();
    }
}
