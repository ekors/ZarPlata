import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Ievgen.Korsun on 2/6/2017.
 */
public class Manager extends Employee {
    ArrayList<Employee> listOfSubordinates;

    public Manager(String name, Calendar birthday, Calendar hireDate, ArrayList<Employee> listOfSubordinates) {
        super(name, birthday, hireDate);
        this.listOfSubordinates = listOfSubordinates;
    }

    public ArrayList<Employee> getListOfSubordinates() {
        return listOfSubordinates;
    }
}
