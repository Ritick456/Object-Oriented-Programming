package Level2;

class Student {
    public int rollNumber;  // Public access
    protected String name;  // Protected access
    private double cgpa;    // Private access

    // Default Constructor
    Student() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Getter for CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Setter for CGPA
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Subclass inheriting Student
class PostgraduateStudent extends Student {

    // Constructor to initialize PostgraduateStudent
    PostgraduateStudent(int rollNumber, String name) {
        super(rollNumber, name);
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCgpa()); // Using getter for private field
    }
}

public class University {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student s1 = new Student(12, "Rk");
        s1.setCgpa(3.8);

        // Creating an instance of PostgraduateStudent
        PostgraduateStudent p1 = new PostgraduateStudent(22, "John Doe");
        p1.setCgpa(4.0);

        // Display details
        p1.display();
    }
}
