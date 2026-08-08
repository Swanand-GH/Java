class Employee {
    static double taxRate;

    static {
        taxRate = 0.18;
        System.out.println("Static block executed: Tax rate set to 18%");
    }

    String name;

    Employee(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println(name + " - Common Tax Rate: " + (taxRate * 100) + "%");
    }
}

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Main starts");

        Employee e1 = new Employee("Amit");
        Employee e2 = new Employee("Sara");
        Employee e3 = new Employee("Rahul");

        e1.showInfo();
        e2.showInfo();
        e3.showInfo();

        System.out.println("Main ends");
    }
}
