public class PermanentEmployee extends Employee{

    double pensionPercentage;

    public PermanentEmployee(int id, String name, double taxPercentage, double otherDeductions, double pensionPercentage) {
        super(id, name, taxPercentage, otherDeductions);
        this.pensionPercentage = pensionPercentage;
    }

    int showDetails(){
        System.out.println("Permanent Employee\n");
        System.out.println("Id: " + id + "\n");
        System.out.println("Name: " + name + "\n");
        System.out.println("Tax Percentage: " + taxPercentage + "\n");
        System.out.println("Other Deductions: " + otherDeductions + "\n");
        System.out.println("Pension Percentage: " + pensionPercentage + "\n");

        return 0;
    }

}
