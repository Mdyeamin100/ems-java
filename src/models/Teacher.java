package models;

public class Teacher extends Person {
    private String department;
    private double salary;

    public Teacher(String id, String name, String email, String department, double salary) {
        super(id, name, email);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + getName() + " (ID: " + getId() + ")");
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
