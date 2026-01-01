package managers;

import models.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            student.displayInfo();
            System.out.println("---------------------------");
        }
    }

    public Student getStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(String id, String name, String email, double gpa) {
        Student student = getStudent(id);
        if (student != null) {
            student.setName(name);
            student.setEmail(email);
            student.setGpa(gpa);
            System.out.println("Student updated successfully.");
            return true;
        }
        System.out.println("Student not found.");
        return false;
    }

    public boolean deleteStudent(String id) {
        Student student = getStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
            return true;
        }
        System.out.println("Student not found.");
        return false;
    }

    public boolean authenticateStudent(String id, String password) {
        Student student = getStudent(id);
        if (student != null && student.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
