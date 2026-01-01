package models;

public class Student extends Person {
    private double gpa;
    private String password;

    public Student(String id, String name, String email, double gpa, String password) {
        super(id, name, email);
        this.gpa = gpa;
        this.password = password;
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + " (ID: " + getId() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("GPA: " + gpa);
        // Password is not displayed for security
    }
}
