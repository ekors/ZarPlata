import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Ievgen.Korsun on 2/6/2017.
 */
public class Manager extends Employee {
    private static final float MANAGERS_PREMIA = 1000;
    ArrayList<Employee> listOfSubordinates;

    public Manager(int id, String name, int salary, Calendar birthday, Calendar hireDate, ArrayList<Employee> listOfSubordinates) {
        super(id, name, birthday, hireDate, salary);
        this.listOfSubordinates = listOfSubordinates;
    }


    @Override
    public float getSalaryWithBonus() {
        return super.getSalaryWithBonus() + (MANAGERS_PREMIA * getListOfSubordinates().size());
    }

    public ArrayList<Employee> getListOfSubordinates() {
        return listOfSubordinates;
    }
}
