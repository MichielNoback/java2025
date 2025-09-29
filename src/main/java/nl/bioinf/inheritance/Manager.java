package nl.bioinf.inheritance;

public class Manager extends Employee {
    public Manager(double salary, String name, int age) {
        super(salary, name, age);
    }

    public void hire(Employee employee) {
        System.out.println(employee.getName() + ", you're hired.");
    }

    public void fire(Employee employee) {
        System.out.println(employee.getName() + ", you're fired!");
    }

}
