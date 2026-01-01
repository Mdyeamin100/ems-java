package models;

public class Student extends Person {
    private double gpa;

    public Student(String id, String name, String email, double gpa) {
        super(id, name, email);
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + " (ID: " + getId() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("GPA: " + gpa);
    }
}
