import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company {

    private int fond;

    public Company(ArrayList<Department> departments) {
        this.departments = departments;
    }

    private ArrayList<Department> departments;


    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
