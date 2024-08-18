// Parent Class: Student
class Student {
    String name;
    String usn;
    String department;
    String section;

    // Constructor
    Student(String name, String usn, String department, String section) {
        this.name = name;
        this.usn = usn;
        this.department = department;
        this.section = section;
    }

    // Method to calculate and display average
    void calculateAverage(int m1, int m2, int m3) {
        int average = (m1 + m2 + m3) / 3;
        System.out.println("Average Marks: " + average);
    }
}

// Subclass: Marks
class Marks extends Student {
    int m1, m2, m3;

    // Constructor
    Marks(String name, String usn, String department, String section, int m1, int m2, int m3) {
        super(name, usn, department, section);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to check if the student has scored more than 70 in all subjects
    void checkEligibility() {
        if (m1 > 70 && m2 > 70 && m3 > 70) {
            System.out.println(name + " has scored more than 70 in all subjects.");
        } else {
            System.out.println(name + " has not scored more than 70 in all subjects.");
        }
    }
}

// Service Class: Service to access properties
class Service {
    public static void main(String[] args) {
        // Object of Parent Class (Student)
        Student student = new Student("Alice", "1A2B3C", "Computer Science", "A");
        student.calculateAverage(75, 80, 85);

        // Object of Sub Class (Marks)
        Marks marks = new Marks("Alice", "1A2B3C", "Computer Science", "A", 75, 80, 85);
        marks.checkEligibility();
    }
}
