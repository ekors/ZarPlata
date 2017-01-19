import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public void getEmployeesNames() {
        for (Employee emp : employees) {
            String name = emp.getName();
            System.out.println(name);
        }
    }

    public void printZP() {
        for (Employee emp: employees) {
            System.out.println("ZP " + emp.getName() + " = "  + emp.getSalary());
        }

    }

    public Employee getEmployees() {
        Employee employee = null;
        for (Employee emp : employees) {
            employee = emp;
            System.out.println("сотрудник " + employee.getName());
        }
        return employee;
    }

    public float getZP() {
        int totalZP = 0;
        for (Employee emp : employees) {
            totalZP += emp.getSalary();
        }
        return totalZP;
    }

    public int getEmployeesAmount() {
        return employees.size();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
