import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Main {
    public static void main(String[] args) {


        ArrayList<Employee> qaEmployees = new ArrayList();
        qaEmployees.add(new Employee(1, "Petrenko", new GregorianCalendar(1986, Calendar.JANUARY, 27), 1000));
        qaEmployees.add(new Employee(2, "Tkachuk", new GregorianCalendar(1986, Calendar.FEBRUARY, 24), 1200));
        qaEmployees.add(new Employee(3, "Golovko", new GregorianCalendar(1986, Calendar.MARCH, 12), 1100));

        ArrayList<Employee> devEmployees = new ArrayList();
        devEmployees.add(new Employee(4, "Vashchuk", new GregorianCalendar(1986, Calendar.DECEMBER, 8), 2000));
        devEmployees.add(new Employee(5, "Rebrov", new GregorianCalendar(1986, Calendar.FEBRUARY, 21), 2200));
        devEmployees.add(new Employee(6, "Luzhniy", new GregorianCalendar(1986, Calendar.MARCH, 3), 2503));

        ArrayList<Employee> testDataGeneratoList = new ArrayList<>();
        DataGenerator.generateListOfEmployees(testDataGeneratoList);

        for (Employee emp: testDataGeneratoList) {
            Calendar calendar = emp.getBirthday();
            int i = 0;
            System.out.println(emp.getId() + " дата " + calendar.getTime().toString());
        }

        Department qaDepartment = new Department("QADepartment", qaEmployees);
        Department devDepartment = new Department("DevDepartment", devEmployees);
        Department generatedDepartment = new Department("GeneratedDepartment", testDataGeneratoList);

        ArrayList<Department> departments = new ArrayList();
        departments.add(qaDepartment);
//        departments.add(devDepartment);
//        departments.add(generatedDepartment);

        // checks method
//        qaDepartment.getEmployees();


//        Department.printZP(departments);
        System.out.println("-----------------------------------------------------");

        Company company = new Company(departments);
        EqualSalaryScheme scheme = new EqualSalaryScheme();
        System.out.println(scheme.calcSalary(company).toString());
        company.printSalaryInfo();
        System.out.println("departmentsSize " + company.getDepartmentsAmount());

        //TODO create proportional scheme
        //TODO cover with unit tests

        //TODO printZP in new method                                                done
        //TODO do while cycle instead of exception for fond value                   done
        //TODO clear Company from service logic (create service class for these)
        //TODO clear Main class from logic. Transfer to DataGenerator class



    }
}
