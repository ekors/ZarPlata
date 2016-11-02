/**
 * Created by ievgen.korsun on 11/1/2016.
 */
public class Employees {
    private String name;
    private int id;
    private int salary;
    private boolean birthday;
    private String department;
    private Employees[] employeesDB;
    private String[] employeesNames;


    //constructors

    public Employees() {
    }

    public Employees(String name) {
        this.name = name;
    }

    public Employees(String name, int id, int salary, boolean birthday, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.birthday = birthday;
        this.department = department;
    }


    //getters and setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isBirthday() {
        return birthday;
    }
    public void setBirthday(boolean birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Employees[] getEmployeesDB() {
        return employeesDB;
    }
    public void setEmployeesDB(Employees[] employeesDB) {
        this.employeesDB = employeesDB;
    }

    public String[] getEmployeesNames() {
        return employeesNames;
    }

    public void setEmployeesNames(String[] employeesNames) {
        this.employeesNames = employeesNames;
    }
}
