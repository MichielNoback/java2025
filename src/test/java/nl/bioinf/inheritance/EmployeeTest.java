package nl.bioinf.inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void createCollection() {
        Employee emp1 = new Employee(1000, "Mark", 45);
        Employee emp2 = new Employee(2000, "Josephine", 29);
        Employee emp3 = new Manager(7000, "Hank", 39);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        processEmployees(employees);
    }

    private void processEmployees(List<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp + " retires in "
                    + emp.yearsToEmployment() + " years");
            //((Manager) emp).fire(new Employee(0.0, "", 41)); // ClassCastException!
            if (emp instanceof Manager) {
                ((Manager) emp).fire(new Employee(0.0, "", 41));
            }
        }
    }

}