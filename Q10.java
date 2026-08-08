import hr.Employee;
import admin.Manager;

public class Q10 {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 30, 101);

        System.out.println("Public name: " + e.name);

        Manager m = new Manager("Bob", 40, 102);


        m.showProtected();

        e.showPrivate();
    }
}
