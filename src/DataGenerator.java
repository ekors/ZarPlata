import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Ievgen.Korsun on 1/20/2017.
 */
public class DataGenerator {


    public static ArrayList<Department> generateLists() {
        ArrayList<Department> departments = new ArrayList<>();
        for (int i =0; i < getRandomNumberInRange(2, 5); i++) {
            departments.add(new Department("Department " + (i + 1), generateListOfEmployees()));
        }
        return departments;
    }

    public static ArrayList<Employee> generateListOfEmployees () {
        ArrayList<Employee> employeesList = new ArrayList<>();
        for (int i = 0; i < getRandomNumberInRange(10, 30); i++) {
            employeesList.add(new Employee(i + 1, "Employee " + (i + 1),new GregorianCalendar( getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1,12), getRandomNumberInRange(1, 28)), getRandomNumberInRange(1000, 5000)));
        }
        return employeesList;
    }

    public static String format(Calendar calendar){
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
}
