import java.util.Calendar;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Employee {
    private int id;
    private String name;
    private int salary;
    private Calendar birthday;
    private Calendar hireDate;
    private Department department;


    public Employee(int id, String name, Calendar birthday, int salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public Employee(String name, Calendar birthday, Calendar hireDate) {
        this.name = name;
        this.birthday = birthday;
        this.hireDate = hireDate;
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

    public float getSalary() {
        return salary;
    }

    public float getSalaryWithBonus() {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (getBirthday().get(Calendar.MONTH) == currentMonth) {
            return salary + Company.BIRTHDAY_BONUS;
        } else return salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
