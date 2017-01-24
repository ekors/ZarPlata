import java.util.*;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company {

    private ArrayList<Department> departments;
    private float fond;
    public static final float BIRTHDAY_BONUS = 1000;
    private int totalZP;
    private float bonuses;
    private float currentBonus;


    public Company(ArrayList<Department> departments) {
        this.departments = departments;
        fondVerification();
    }

    public void fondVerification() {
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a fond value: ");
            fond = in.nextFloat();
        }
        while (getFond() < getZP());
    }


    public float getZP() {
        int totalZP = 0;
        for (Department department : departments) {
            totalZP += department.getZP();
        }
        return totalZP;
    }

    public float getZPwithBonuses() {


        for (Department department : departments) {
            totalZP += department.getZPwithBonus();
            bonuses = fond - totalZP;
            currentBonus = bonuses / getEmployeesAmount();
        }
        return totalZP;
    }

    public void printSalaryInfo () {
        System.out.println("totalZP is: " + getTotalZP());
        System.out.println("Bonuses value is: " + getBonuses());
        System.out.printf("Current bonus value for every employee is: %.2f\n", getCurrentBonus());
    }

    public List<Employee> getEmployeesList() {
        List<Employee> employeeList = new ArrayList<>();
        for (Department dep: departments) {
            employeeList.addAll(dep.getEmployees());
        }
        return employeeList;
    }

    public int getEmployeesAmount() {
        int size = 0;
        for (Department dep: departments) {
            size += dep.getEmployeesAmount();
        }
        return size;
    }

    public int getDepartmentsAmount() {
        return departments.size();
    }


    public float getFond() {
        return fond;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public int getTotalZP() {
        return totalZP;
    }
    public float getBonuses() {
        return bonuses;
    }
    public float getCurrentBonus() {
        return currentBonus;
    }


}
