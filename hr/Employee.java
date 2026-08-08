package hr;

public class Employee {
    public String name;     // public - everywhere
    protected int age;      // protected - subclass in other package
    private int id;         // private - only this class

    public Employee(String n, int a, int i) {
        name = n;
        age = a;
        id = i;
    }

public void showPrivate() {
        System.out.println("Private id accessed inside class: " + id);
    }
}

