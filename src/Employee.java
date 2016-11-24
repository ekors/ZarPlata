import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Employee {
    private int id;
    private String name;
    private int salary;
    private Calendar birthday;
    private Department department;

    public Employee(int id, String name, Calendar birthday, int salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Calendar getBirthday() {
        return birthday;
    }
}
