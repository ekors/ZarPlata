import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Ievgen.Korsun on 2/6/2017.
 */
public class Manager extends Employee {
    private static float MANAGERS_PREMIA = 1000;
    ArrayList<Employee> listOfSubordinates;

    public Manager(String name, Calendar birthday, Calendar hireDate, ArrayList<Employee> listOfSubordinates) {
        super(name, birthday, hireDate);
        this.listOfSubordinates = listOfSubordinates;
    }

    //super.getSalaryWithBonus() + listEmployees with PREMIA
    @Override
    public float getSalaryWithBonus() {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (getBirthday().get(Calendar.MONTH) == currentMonth) {
            return getSalary() + Company.BIRTHDAY_BONUS + MANAGERS_PREMIA;
        } else return getSalary() + MANAGERS_PREMIA;
    }

    public ArrayList<Employee> getListOfSubordinates() {
        return listOfSubordinates;
    }
}
