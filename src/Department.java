import java.util.ArrayList;

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

    public String getEmployeesNames() {
        String name = "";
        for (Employee emp : employees) {
            name = emp.getName();
        }
        return name;
    }

    public float printZP() {
        float zp = 0;
        for (Employee emp: employees) {
            zp = emp.getSalary();
//            System.out.println("ZP " + emp.getName() + " = "  + emp.getSalary());
        }
        return zp;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public float getZP() {
        int totalZP = 0;
        for (Employee emp : employees) {
            totalZP += emp.getSalary();
        }
        return totalZP;
    }
    public float getZPwithBonus() {
        int totalZP = 0;
        for (Employee emp : employees) {
            totalZP += emp.getSalaryWithBonus();
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
