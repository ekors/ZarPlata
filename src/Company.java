import java.util.*;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company {


    private float fond;
    public static final float BIRTHDAY_BONUS = 1000;

    public Company(ArrayList<Department> departments, float fond) {
        this.departments = departments;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a fond value: ");
        fond = in.nextFloat();
        if (fond < getZP()) {
            throw new IllegalArgumentException("Fond value can't be less than totalZP value! totalZP is: " + getZP());

        }
        this.fond = fond;
    }

    private ArrayList<Department> departments;

    //in current realization it uses getZPwithBonus() instead getZP() because of this method is used in constructor. Or need to make another method getZPwithBonuses() without printing information.
    public float getZP() {
        int totalZP = 0;
        for (Department department : departments) {
            totalZP += department.getZPwithBonus();
        }
//        System.out.println("TOTAL_ZP = " + totalZP);
        return totalZP;
    }

    public float getZPwithBonuses() {
        int totalZP = 0;
        float bonuses = 0;
        float currentBonus = 0;
        for (Department department : departments) {
            totalZP += department.getZPwithBonus();
            bonuses = fond - totalZP;
            currentBonus = bonuses / getEmployeesAmount();
        }
        System.out.println("totalZP is: " + totalZP);
        System.out.println("Bonuses value is: " + bonuses);
        System.out.printf("Current bonus value for every employee is: %.2f\n", currentBonus);
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
