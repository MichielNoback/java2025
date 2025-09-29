package nl.bioinf.inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employee {
    public static final int RETIREMENT_AGE = 67;
    private double salary; // = 0.0
    private String name; // = null;
    private int age; // = 0;
    //greedy
    private List<String> roles = new ArrayList<>(); // = null;

    public Employee(double salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int yearsToEmployment() {
        //int retirementAge = 67; //CONSTANT!
        return RETIREMENT_AGE - age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getRoles() {
        //return roles; //encapsulation violation!
        //return new ArrayList<>(roles); //copy is good but memory intensive
        return Collections.unmodifiableList(roles);
    }

    public void addRole(String role) {
        //lazy!
        //if (roles == null) roles = new ArrayList<>();
        this.roles.add(role); //NullPointerException
    }

    public void setRoles(Collection<String> roles) {
        //this.roles = roles;
        this.roles.clear();
        this.roles.addAll(roles);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                '}';
    }
}
