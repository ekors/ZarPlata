import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Ievgen.Korsun on 1/20/2017.
 */
public class DataGenerator {
    private static int idCount = 0;
    private static int departmentNumber = 0;
    private static int departmentCount = 0;


    //TODO generate starting from Manager: Department > Manager > Employees


    public static Department generateDepartment() {
        Department department = new Department("Department ", generateManagers());
        return department;
    }

    public static ArrayList<Department> generateDepartments() {
        ArrayList<Department> departments = new ArrayList<>();
        for (int i = 0; i < getRandomNumberInRange(2, 5); i++) {
            departments.add(generateDepartment());
        }
        return departments;
    }

    public static ArrayList<Employee> generateManagers() {
        ArrayList<Employee> managerList = new ArrayList<>();
        for (int i =0; i < getRandomNumberInRange(3,6); i++) {
            managerList.add((Manager) new Manager(i, "Manager", getRandomNumberInRange(5000, 10000), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), generateListOfEmployees(3,6)));
        }
        return managerList;
    }

    //private static int managerIdCount = 0;
    //managersList.add(new Manager(managerIdCount + (i + 1), managerName + (managerIdCount + (i + 1)), getRandomNumberInRange(5000, 10000), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), employees));
    //managerIdCount += i;

    public static ArrayList<Employee> generateListOfEmployees(int minValue, int maxValue) {
        ArrayList<Employee> employeesList = new ArrayList<>();
        int i;
        for (i = 0; i < getRandomNumberInRange(minValue, maxValue); i++) {
            employeesList.add(new Employee(idCount + (i + 1), "Employee " + (idCount + (i + 1)), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), getRandomNumberInRange(1000, 5000)));
        }
        idCount += i;
        return employeesList;
    }


    public static int selectDepartment() {
        int i;
        for (i = 0; i < departmentNumber; i++) {

        }
        departmentCount += i;
        return departmentCount;
    }

    public static String format(Calendar calendar) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());
        return dateFormatted;
    }

    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int getDepartmentNumber() {
        return departmentNumber;
    }
}
