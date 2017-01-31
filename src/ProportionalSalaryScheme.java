import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ievgen.Korsun on 1/24/2017.
 */
public class ProportionalSalaryScheme implements Calculator{
    @Override
    public Map<Employee, Float> calcSalary(Company company) {
        float totalBonus = company.getFond() - company.getZPwithBonuses();
        float departmentBonus = totalBonus / company.getDepartmentsAmount();


        float currentBonus = 0;
        for (Department dep : company.getDepartments()) {
            currentBonus = departmentBonus / dep.getEmployees().size();
        }

        Map <Employee, Float> vedomost = new HashMap<>();

        List<Employee> employeesList = company.getEmployeesList();

        for (Employee emp : employeesList) {
            float salaryWithBonuses = emp.getSalaryWithBonus() + currentBonus;
            vedomost.put(emp, salaryWithBonuses);
        }
        return vedomost;
    }
}
