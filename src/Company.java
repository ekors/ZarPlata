import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company {


    private float fond;
    public static final float BIRTHDAY_BONUS = 1000;

    public Company(ArrayList<Department> departments) {
        this.departments = departments;
    }

    private ArrayList<Department> departments;

    public float getZP() {
        int totalZP = 0;
        for (Department department : departments) {
            totalZP += department.getZP();
        }
        return totalZP;
    }

    public float getZPwithBonuses() {
        int totalZP = 0;
        for (Department department : departments) {
            totalZP += department.getZPwithBonus();
        }
        return totalZP;
    }



    public List<Employee> getEmployeesList() {
        List<Employee> employeeList = new ArrayList<>();
        for (Department dep: departments) {
            employeeList.addAll(dep.getEmployees());
        }
        return employeeList;
    }

//    public Employee getEmployeesOfCompany() {
//        Employee employee = null;
//        for (Department department: departments) {
//            employee = department.getEmployees();
//        }
//        return employee;
//    }

//    public int getFond() {
//        return fond;
//    }

    public int getEmployeesAmount() {
        int size = 0;
        for (Department dep: departments) {
            size += dep.getEmployeesAmount();
        }
        return size;
    }

    public float getFond() {
        return fond;
    }

    public void setFond(float fond) {
        this.fond = fond;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }


}
