import java.util.ArrayList;

public class ContractBasisEmployees {
    static ArrayList<ContractBasisEmployee> contractBasisEmployees = new ArrayList<>();
    static void navigate(){

        int to = showEmployees();
        boolean validMenuIndex = validateMenuInput(to);
        while (!validMenuIndex){
            System.out.println("Wrong menu item or employee doesn't exist! try again");
        }
        if(to == -1){
            Employees.showMainMenu();
        }
        ContractBasisEmployee employee = null;
        for (ContractBasisEmployee contractBasisEmployee: contractBasisEmployees){
            if (contractBasisEmployee.id == to){
                employee = contractBasisEmployee;
            }
        }
        showEmployee(employee);
    }

    static int showEmployees(){
        System.out.println("Contract Basis Employees\n");

        for (ContractBasisEmployee employee : contractBasisEmployees){
            System.out.println("Id: "+employee.id + "\nName: " + employee.name + "\n\n");
        }

        return Employees.showEmployeesMenu();
    }

    static boolean validateMenuInput(int to){
        boolean valid = false;
        if (to == -1){
            valid = true;
        }else {
            boolean available = false;
            for (ContractBasisEmployee employee: contractBasisEmployees){
                if (employee.id == to) {
                    available = true;
                    break;
                }
            }
            if(available){
                valid = true;
            }
        }
        return valid;
    }

    static void showEmployee(ContractBasisEmployee contractBasisEmployee){}
}
