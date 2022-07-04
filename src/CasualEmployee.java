public class CasualEmployee extends Employee{
     double salaryAmount;


    public CasualEmployee(int id, String name, double taxPercentage, double otherDeductions, double salaryAmount) {
        super(id, name, taxPercentage, otherDeductions);
        this.salaryAmount = salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
