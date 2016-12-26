import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company implements Calculator{

    private Department dep;
//    private int fond = dep.getZP();

    public Company(ArrayList<Department> departments) {
        this.departments = departments;
    }

    private ArrayList<Department> departments;

//    public int getFond() {
//        return fond;
//    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    @Override
    public HashMap calcSalary() {
        return null;
    }
}
