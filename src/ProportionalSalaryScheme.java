import java.util.Map;

/**
 * Created by Ievgen.Korsun on 1/24/2017.
 */
public class ProportionalSalaryScheme implements Calculator{
    @Override
    public Map<Employee, Float> calcSalary(Company company) {
        float totalBonus = company.getFond() - company.getZPwithBonuses();

        return null;
    }
}
