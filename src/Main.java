import models.Person;
import models.Employee;
import models.Student;
import models.Payable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        payables.add(new Employee("John", "Lennon", "Manager", 27045.78));
        payables.add(new Employee("George", "Harrison", "Developer", 50000.00));
        payables.add(new Student("Ringo", "Starr", 0.0));
        payables.add(new Student("Paul", "McCartney", 3.5));

        for (int i = 0; i < payables.size(); i++) {
            for (int j = i + 1; j < payables.size(); j++) {
                if (payables.get(i).getPaymentAmount() > payables.get(j).getPaymentAmount()) {
                    Payable temp = payables.get(i);
                    payables.set(i, payables.get(j));
                    payables.set(j, temp);
                }
            }
        }

        printData(payables);
    }

    public static void printData(ArrayList<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + String.format("%.2f", payable.getPaymentAmount()) + " tenge");
        }
    }
}
