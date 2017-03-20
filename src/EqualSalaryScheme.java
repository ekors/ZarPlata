import java.util.*;

/**
 * Created by ievgen.korsun on 12/26/16.
 */
public class EqualSalaryScheme implements Calculator {

    @Override
    public Map<Employee, Float> calcSalary(Company company) {
        float totalBonus = company.getFond() - company.getZPwithBonuses();
        float currentBonus = totalBonus / company.getEmployeesAmount();

        Map <Employee, Float> vedomost = new HashMap<>();

        List<Employee> employeesList = company.getEmployeesList();
        List<Manager> managerList = company.getManagerList();

        for (Manager manager: managerList) {
            float salaryWithBonus = manager.getSalaryWithBonus() + currentBonus;
            vedomost.put(manager, salaryWithBonus);
        }
        for (Employee emp : employeesList) {
            float salaryWithBonuses = emp.getSalaryWithBonus() + currentBonus;
            vedomost.put(emp, salaryWithBonuses);
        }
        return vedomost;
    }
}
