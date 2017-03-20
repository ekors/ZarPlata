import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Ievgen.Korsun on 1/20/2017.
 */
public class DataGenerator {
    private static int idCount = 0;
    private static int managerIdCount = 0;
    private static int departmentNumber = 0;
    private static int departmentCount = 0;
    private static ArrayList<Manager> managersList = new ArrayList<>(); //make private and init inside method

    //TODO generate starting from Manager: Department > Manager > Employees
    //TODO create new method generateDepartment() use for statement

    public static ArrayList<Department> generateLists() {
        ArrayList<Department> departments = new ArrayList<>();
        String managerName = "Manager ";
        int i;
        for (i = 0; i < getRandomNumberInRange(2, 5); i++) {
            ArrayList<Employee> employees = generateListOfEmployees();
            departments.add(generatNewDep(managerName, i, employees));
            managersList.add(generateNewManager(managerName, i, employees));
        }
        managerIdCount += i;
        departmentNumber = departments.size();
        return departments;
    }

    private static Department generatNewDep(String managerName, int i, ArrayList<Employee> employees) {
        return new Department("Department " + (i + 1), employees, managerName + (managerIdCount + (i + 1)));
    }

    private static Manager generateNewManager(String managerName, int i, ArrayList<Employee> employees) {
        return new Manager(managerIdCount + (i + 1), managerName + (managerIdCount + (i + 1)), getRandomNumberInRange(5000, 10000), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1, 12), getRandomNumberInRange(1, 28)), employees);
    }

    public static ArrayList<Employee> generateListOfEmployees() {
        ArrayList<Employee> employeesList = new ArrayList<>();
        int i;
        for (i = 0; i < getRandomNumberInRange(10, 30); i++) {
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

    //    public static ArrayList<Employee> generateListOfManagers() {
//        ArrayList<Employee> managersList = new ArrayList<>();
//
//        for(int i = 0; i < departmentNumber; i++) {
//            managersList.add(new Manager(i, "Manager " + i, getRandomNumberInRange(5000, 10000), new GregorianCalendar(getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1,12), getRandomNumberInRange(1,28)), new GregorianCalendar(getRandomNumberInRange(2010, 2017), getRandomNumberInRange(1,12), getRandomNumberInRange(1,28)), dep)
//        }
//    }

//    public static ArrayList<Employee> generateListOfManagers () {
//        ArrayList<Employee> managerList = new ArrayList<>();
//        Department listOfEmployees;
//        int i;
//        for (i = 0; i < getRandomNumberInRange(10, 30); i++) {
//            managerList.add(new Manager(idCount + (i+1), "Employee " + (idCount +(i + 1)),new GregorianCalendar( getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1,12), getRandomNumberInRange(1, 28)), new GregorianCalendar( getRandomNumberInRange(2010, 2016), getRandomNumberInRange(1,12), getRandomNumberInRange(1, 28)), getRandomNumberInRange(1000, 5000), listOfEmployees.getEmployees()));
//        }
//        idCount += i;
//        return managerList;
//    }

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

    public static ArrayList<Manager> getManagersList() {
        return managersList;
    }
}
