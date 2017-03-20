import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ievgen.korsun on 11/2/2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Department> departments = DataGenerator.generateLists();

        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getManagerName());
            System.out.println(DataGenerator.getManagersList().get(i).getListOfSubordinates());
        }

        System.out.println(DataGenerator.getManagersList());


        //CHECKER
//        for (Employee emp : departments.get(0).getEmployees()) {
//        System.out.println(emp.getName());
//        }

//        System.out.println("-----------------------------------------------------");

        Company company = new Company(departments);
//        EqualSalaryScheme equalSalaryScheme = new EqualSalaryScheme();
//        System.out.println(equalSalaryScheme.calcSalary(company).toString());
//        company.printSalaryInfo();

        ProportionalSalaryScheme proportionalSalaryScheme = new ProportionalSalaryScheme();
        System.out.println(proportionalSalaryScheme.calcSalary(company).toString());
        company.printSalaryInfo();
//
////        CHECKER
//        for (int i = 0; i < departments.size(); i++) {
//            for (Employee emp : departments.get(i).getEmployees()) {
//                System.out.println("id: [" + emp.getId() + "] " + emp.getName() + " ZP " + emp.getSalaryWithBonus());
//            }
//            System.out.println("--------------------------------------");
//        }

        //TODO create proportional scheme                                           done
        //TODO printZP in new method                                                done
        //TODO do while cycle instead of exception for fond value                   done
        //TODO clear Main class from logic. Transfer to DataGenerator class         done
        //TODO resolve issue with id's                                              done
        //TODO cover with unit tests
        //TODO move fondVerification() to Main or other new Class
        //TODO clear Company from service logic (create service class for these)

        //TODO constructor                                                          done
        //TODO make new collection Managers
        //TODO generate managers using dataGenerator
        //TODO for changing type need rewright type Emp > Man and back
        //TODO change overrided method getZPWithBonuses                             done


    }
}
