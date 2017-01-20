import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Ievgen.Korsun on 1/20/2017.
 */
public class DataGenerator {
    public void generateListOfEmployees () {
        ArrayList<Employee> employeesList = new ArrayList<>();
        for (int i = 0; i < getRandomNumberInRange(10, 30); i++) {
            employeesList.add(new Employee(i + 1, "Employee " + (i + 1), getRandomNumberInRange(1950, 2000), getRandomNumberInRange(1000, 5000)));
        }
    }

    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
