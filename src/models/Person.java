package models;

public class Person implements Payable {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter;
        idCounter++;
        this.name = "Default";
        this.surname = "Default";
    }

    public Person(String name, String surname) {
        this.id = idCounter;
        idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    public double getPaymentAmount() {
        return 0.0;
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
