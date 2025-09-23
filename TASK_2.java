import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private String course;
    private double marks;
    private char grade;

    // Setter methods
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    // Calculate grade
    private char calculateGrade(double marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grade);
        System.out.println("---------------------------");
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ========== Task 1 Demo ==========
        System.out.println("\n--- Task 1: Single Student Records ---");
        Student s1 = new Student();
        s1.setRollNumber(1);
        s1.setName("Alice");
        s1.setCourse("Math");
        s1.setMarks(95);
        s1.displayStudent();

        Student s2 = new Student();
        s2.setRollNumber(2);
        s2.setName("Bob");
        s2.setCourse("Science");
        s2.setMarks(82);
        s2.displayStudent();

        // ========== Task 2 & Task 3 ==========
        System.out.println("\n--- Task 2 & Task 3: Multiple Students ---");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            Student s = new Student();

            System.out.print("Roll Number: ");
            s.setRollNumber(sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            s.setName(sc.nextLine());

            System.out.print("Course: ");
            s.setCourse(sc.nextLine());

            System.out.print("Marks: ");
            s.setMarks(sc.nextDouble());
            sc.nextLine();

            students[i] = s;
            System.out.println("Student added successfully!");
        }

        // Display all student records
        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
        }

        sc.close();
    }
}
