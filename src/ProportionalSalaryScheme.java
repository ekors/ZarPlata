import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ievgen.Korsun on 1/24/2017.
 */
public class ProportionalSalaryScheme implements Calculator {
    @Override
    public Map<Employee, Float> calcSalary(Company company) {
        float totalBonus = company.getFond() - company.getZPwithBonuses();
        float departmentBonus = totalBonus / company.getDepartmentsAmount();


        Map<Employee, Float> vedomost = new HashMap<>();
        List<Employee> employeesList = company.getEmployeesList();
        for (Department dep : company.getDepartments()) {
            float currentBonus = 0;
            currentBonus = departmentBonus / dep.getEmployees().size();


            for (Employee emp : employeesList) {
                float salaryWithBonuses = emp.getSalaryWithBonus() + currentBonus;
                vedomost.put(emp, salaryWithBonuses);
            }
        }
        return vedomost;
    }
}
