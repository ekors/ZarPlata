/**
 * Created by ievgen.korsun on 11/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        String[] empNames = {"A A", "B B", "C C", "D D", "E E"};
        int[] salary = {700, 800, 900, 1000, 1100};
        Employees[] totalEmployees = new Employees[empNames.length];
        for (int i =0; i < totalEmployees.length; i++) {
            totalEmployees[i] = new Employees(empNames[i], (i+1), salary[i], false, );
        }
    }
}
