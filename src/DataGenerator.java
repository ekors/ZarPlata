import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Ievgen.Korsun on 1/20/2017.
 */
public class DataGenerator {
    private static int idCount = 0;

    //TODO generate starting from Manager: Department > Manager > Employees

    public static ArrayList<Employee> generateListOfEmployees(int minValue, int maxValue) {
        ArrayList<Employee> employeesList = new ArrayList<>();
        int i;
        for (i = 0; i < getRandomNumberInRange(minValue, maxValue); i++) {
            employeesList.add(new Employee(idCount + (i + 1), "Employee " + (idCount + (i + 1)), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), getRandomNumberInRange(1000, 5000)));
        }
        idCount += i;
        return employeesList;
    }

    public static ArrayList<Manager> generateManagers(int minValue, int maxValue) {
        ArrayList<Manager> managerList = new ArrayList<>();
        for (int i =0; i < getRandomNumberInRange(minValue, maxValue); i++) {
            managerList.add(new Manager(i, "Manager", getRandomNumberInRange(5000, 10000), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), generateListOfEmployees(3,6)));
        }
        return managerList;
    }

    public static Department generateDepartment() {
        Department department = new Department("Department ", generateManagers(2, 3), generateListOfEmployees(2, 6));
        return department;
    }

    public static ArrayList<Department> generateDepartments(int minValue, int maxValue) {
        ArrayList<Department> departments = new ArrayList<>();
        for (int i = 0; i < getRandomNumberInRange(minValue, maxValue); i++) {
            departments.add(generateDepartment());
        }
        return departments;
    }

    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
