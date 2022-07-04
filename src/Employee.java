public class Employee {
    int id;
    String name;
    double taxPercentage;
    double otherDeductions;

    public Employee(int id, String name, double taxPercentage, double otherDeductions) {
        this.id = id;
        this.name = name;
        this.taxPercentage = taxPercentage;
        this.otherDeductions = otherDeductions;
    }

}
