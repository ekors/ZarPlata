import java.util.Calendar;

/**
 * Created by Ievgen.Korsun on 2/9/2017.
 */
public class OtherEmployee extends Employee{
    private String description;

    public OtherEmployee(String name, Calendar birthday, Calendar hireDate, String description) {
        super(name, birthday, hireDate);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
