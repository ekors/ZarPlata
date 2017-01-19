import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Main {
    public static void main(String[] args) {



        ArrayList<Employee> qaEmployees = new ArrayList();
        qaEmployees.add( new Employee(1, "Petrenko", new GregorianCalendar(1986, Calendar.DECEMBER, 27), 1000));
        qaEmployees.add( new Employee(2, "Tkachuk", new GregorianCalendar(1986, Calendar.FEBRUARY, 24), 1200));
        qaEmployees.add( new Employee(3, "Golovko", new GregorianCalendar(1986, Calendar.MARCH, 12), 1100));

        ArrayList<Employee> devEmployees = new ArrayList();
        devEmployees.add( new Employee(4, "Vashchuk", new GregorianCalendar(1986, Calendar.DECEMBER, 8), 2000));
        devEmployees.add( new Employee(5, "Rebrov", new GregorianCalendar(1986, Calendar.FEBRUARY, 21), 2200));
        devEmployees.add( new Employee(6, "Luzhniy", new GregorianCalendar(1986, Calendar.MARCH, 3), 2503));

        Department qaDepartment = new Department("QADepartment", qaEmployees);
        Department devDepartment = new Department("DevDepartment", devEmployees);

        ArrayList<Department> departments = new ArrayList();
        departments.add(0, qaDepartment);
        departments.add(1, devDepartment);

        // checks method
//        qaDepartment.getEmployees();


//        Department.printZP(departments);
        System.out.println("-----------------------------------------------------");
        Company company = new Company(departments);
//        System.out.println(company.getEmployeesOfCompany().getName());
        EqualSalaryScheme scheme = new EqualSalaryScheme();
        System.out.println(scheme.calcSalary(company).toString());

        //TODO set fond to apropriate value (> zp with all bonuses
        //TODO make some generator for Employees
        //TODO cover with unit tests

    }
}
