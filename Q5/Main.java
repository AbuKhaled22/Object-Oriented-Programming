import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter the number of courses: ");
            int numCourses = scanner.nextInt();
            int[] marks = new int[numCourses];

            System.out.println("Enter marks for each course:");
            for (int j = 0; j < numCourses; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }

            students[i] = new Student(name, id, marks);
        }

        displayStudentWithHighestAverage(students);

        scanner.close();
    }

    public static void displayStudentWithHighestAverage(Student[] students) {
        if (students.length == 0) {
            System.out.println("No students to display.");
            return;
        }

        Student highestAvgStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateAverageMarks() > highestAvgStudent.calculateAverageMarks()) {
                highestAvgStudent = students[i];
            }
        }

        System.out.println("\nStudent with the highest average grade:");
        System.out.println(highestAvgStudent.toString());
    } 
}
