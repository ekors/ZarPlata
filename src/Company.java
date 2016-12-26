import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Company {


    private float fond;

    public Company(ArrayList<Department> departments) {
        this.departments = departments;
    }

    private ArrayList<Department> departments;

    public float getZP() {
        int totalZP = 0;
        for (Department department : departments) {
            totalZP += department.getZP();
        }
        return totalZP;
    }

//    public int getFond() {
//        return fond;
//    }

    public int getEmployeesAmount() {
        int size = 0;
        for (Department dep: departments) {
            size += dep.getEmployeesAmount();
        }
        return size;
    }

    public float getFond() {
        return fond;
    }

    public void setFond(float fond) {
        this.fond = fond;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }


}
