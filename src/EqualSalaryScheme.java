import java.util.HashMap;
import java.util.Map;

/**
 * Created by ievgen.korsun on 12/26/16.
 */
public class EqualSalaryScheme implements Calculator {
    @Override
    public Map<Employee, Float> calcSalary(Company company) {
        float totalBonus = company.getFond() - company.getZP();
        float currentBonus = totalBonus / company.getEmployeesAmount();
        Map <Employee, Float> vedomost = new HashMap<>();
        //TODO: get all employees from Company
        //TODO: iterate through this list and put names and salaries dynamically
        //TODO: don't forget about birthday bonus (totalBonus)
        return null;
    }
}
