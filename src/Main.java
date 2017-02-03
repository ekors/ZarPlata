import java.util.ArrayList;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Department> departments = DataGenerator.generateLists();

        //CHECKER
//        for (Employee emp : departments.get(0).getEmployees()) {
//        System.out.println(emp.getName());
//        }

//        System.out.println("-----------------------------------------------------");

        Company company = new Company(departments);
//        EqualSalaryScheme scheme = new EqualSalaryScheme();
//        System.out.println(scheme.calcSalary(company).toString());
//        company.printSalaryInfo();

        ProportionalSalaryScheme propScheme = new ProportionalSalaryScheme();
        System.out.println(propScheme.calcSalary(company).toString());
        company.printSalaryInfo();

//        CHECKER
        for (int i = 0; i < departments.size(); i++) {
            for (Employee emp : departments.get(i).getEmployees()) {
                System.out.println("id: [" + emp.getId() + "] " + emp.getName() + " ZP " + emp.getSalaryWithBonus());
            }
            System.out.println("--------------------------------------");
        }

        //TODO create proportional scheme                                           done
        //TODO cover with unit tests

        //TODO printZP in new method                                                done
        //TODO do while cycle instead of exception for fond value                   done
        //TODO clear Company from service logic (create service class for these)
        //TODO clear Main class from logic. Transfer to DataGenerator class         done
        //TODO resolve issue with id's



    }
}
