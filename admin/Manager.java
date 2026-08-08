package admin;

import hr.Employee;

public class Manager extends Employee {
    public Manager(String n, int a, int i) {
        super(n, a, i);
    }

public void showProtected() {
        System.out.println("Protected age accessed in subclass: " + age);
    }
}

