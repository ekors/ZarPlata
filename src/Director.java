import java.util.Calendar;

/**
 * Created by Ievgen.Korsun on 2/9/2017.
 */
public class Director extends Employee {
    private String description;
    private static final float BONUS = 5000;

    public Director(int id, String name, int salary, Calendar birthday, Calendar hireDate, String description) {
        super(id, name, birthday, hireDate, salary);
        this.description = description;
    }

    @Override
    public float getSalaryWithBonus() {
        return super.getSalaryWithBonus() + BONUS;
    }

    public String getDescription() {
        return description;
    }
}


//rename > Director with large bonus