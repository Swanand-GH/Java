class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus(double percent) {
        return salary * (percent / 100);
    }

    static double getTaxSlab() {
        return 30.0;   
    }

    void showDetails() {
        System.out.println("Employee: " + name + ", Salary: Rs." + salary
                + ", Tax Slab: " + getTaxSlab() + "%");
    }
}

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Company-wide tax slab: " + Employee.getTaxSlab() + "%");

        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Sneha", 80000);

        e1.showDetails();
        e2.showDetails();

        System.out.println(e1.name + "'s 10% bonus: Rs." + e1.calculateBonus(10));
        System.out.println(e2.name + "'s 10% bonus: Rs." + e2.calculateBonus(10));
    }
}
