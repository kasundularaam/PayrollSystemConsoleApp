public class ContractBasisEmployee extends Employee{
    double paymentPerWorkUnit;
    private int workUnits;

    public ContractBasisEmployee(int id, String name, double taxPercentage, double otherDeductions, double paymentPerWorkUnit) {
        super(id, name, taxPercentage, otherDeductions);
        this.paymentPerWorkUnit = paymentPerWorkUnit;
    }

    public void setPaymentPerWorkUnit(double paymentPerWorkUnit) {
        this.paymentPerWorkUnit = paymentPerWorkUnit;
    }

    public void setWorkUnits(int workUnits) {
        this.workUnits = workUnits;
    }

}
