import java.util.Scanner;

class Employee {
    private double salary;
    Employee(double s) {
        salary = s;
    }

    void increaseSalary(double amount) {
        if (amount > 0) {
            salary = salary + amount;
            System.out.println("Salary increased by " + amount);
        } else {
            System.out.println("Invalid! Salary can only be increased.");
        }
    }

    void showSalary() {
        System.out.println("Current salary: " + salary);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee(50000);  

        e.showSalary();

        System.out.print("Enter salary increase amount: ");
        double amt = sc.nextDouble();

        e.increaseSalary(amt);   
        e.showSalary();

        sc.close();
    }
}
