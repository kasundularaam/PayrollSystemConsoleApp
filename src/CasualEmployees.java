import java.util.ArrayList;

public class CasualEmployees {
    static ArrayList<CasualEmployee> casualEmployees = new ArrayList<>();

    static void navigate(){
        int sETo = showEmployees();
        boolean validMenuIndex = validateMenuInput(sETo);
        while (!validMenuIndex){
            System.out.println("Wrong menu item or employee doesn't exist! try again");
        }
        if(sETo == -1){
            Employees.showMainMenu();
        }
        CasualEmployee employee = null;
        for (CasualEmployee casualEmployee: casualEmployees){
            if (casualEmployee.id == sETo){
                employee = casualEmployee;
            }
        }
        showEmployee(employee);
    }

    static int showEmployees(){
        System.out.println("Casual Employees\n");

        for (CasualEmployee employee : casualEmployees){
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
            for (CasualEmployee employee: casualEmployees){
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

    static void showEmployee(CasualEmployee casualEmployee){}
}
