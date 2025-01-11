package models;

public class Student extends Person {
    private double gpa;

    public Student() {
        super();
        this.gpa = 0.0;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0.0;
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}
