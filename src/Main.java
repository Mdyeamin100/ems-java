import managers.StudentManager;
import models.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Education Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Optimize/Validate Student Login");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) continue;
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = 0.0;
                    try {
                        gpa = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid GPA. setting to 0.0");
                    }
                    studentManager.addStudent(new Student(id, name, email, gpa, password));
                    break;
                case 2:
                    studentManager.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter ID of student to update: ");
                    String updateId = scanner.nextLine();
                    if (studentManager.getStudent(updateId) == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter New GPA: ");
                    double newGpa = 0.0;
                    try {
                        newGpa = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid GPA. setting to 0.0");
                    }
                    studentManager.updateStudent(updateId, newName, newEmail, newGpa);
                    break;
                case 4:
                    System.out.print("Enter ID of student to delete: ");
                    String deleteId = scanner.nextLine();
                    studentManager.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    String authId = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String authPass = scanner.nextLine();
                    if (studentManager.authenticateStudent(authId, authPass)) {
                        System.out.println("Authentication Successful! Access Granted.");
                    } else {
                        System.out.println("Authentication Failed. Invalid ID or Password.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
