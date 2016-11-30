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

    public void getEmployeesNames() {
               for (Employee emp : employees) {
                String name = emp.getName();
                System.out.println(name);
            }
        }

    public int getZP() {
        int totalZP = 0;
        for (Employee emp: employees) {
            totalZP += emp.getSalary();
        }
        return totalZP;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
