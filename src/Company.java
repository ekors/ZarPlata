import java.util.*;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company {

    private ArrayList<Department> departments;
    private float fond;
    public static final float BIRTHDAY_BONUS = 1000;

    public Company(ArrayList<Department> departments) {
        this.departments = departments;
        fondVerification();
    }

    public void fondVerification() { // move to main or to some class
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a fond value: ");
            fond = in.nextFloat();
        }
        while (getFond() < getZPwithBonuses());
        if (getFond() < getZP()) {
            System.out.println("Fond value can't be < ZP");
        }
    }


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

    //TODO correct method done
    public void printSalaryInfo() {
        float currentBonus = 0;
        int totalZP = 0;
        float bonuses = 0;
        for (Department department : departments) {
            totalZP += department.getZPwithBonus();
        }
        bonuses = fond - totalZP;
        for (Department department : departments) {
            currentBonus = bonuses / department.getEmployeesAmount();
            System.out.println("current bonus is: " + currentBonus);
        }
        System.out.println("bonus is: " + bonuses);
        System.out.println("totalZP is: " + getZPwithBonuses());
    }

    public List<Employee> getEmployeesList() {
        List<Employee> employeeList = new ArrayList<>();
        for (Department dep: departments) {
            employeeList.addAll(dep.getEmployees());
        }
        return employeeList;
    }

    public List<Manager> getManagerList() {
        List<Manager> managerList = new ArrayList<>();
        for (Department dep: departments) {
            managerList.addAll(dep.getManagers());
        }
        return managerList;
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

//    public int getTotalZP() {
//        return totalZP;
//    }
//    public float getBonuses() {
//        return bonuses;
//    }
//    public float getCurrentBonus() {
//        return currentBonus;
//    }


}
