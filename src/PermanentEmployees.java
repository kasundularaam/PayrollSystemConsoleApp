import java.util.ArrayList;

public class PermanentEmployees {

     static ArrayList<PermanentEmployee> permanentEmployees = new ArrayList<>();

    static void navigate(){
        int sETo = showEmployees();
        boolean validMenuIndex = validateMenuInput(sETo);
        while (!validMenuIndex){
            System.out.println("Wrong menu item or employee doesn't exist! try again");
        }
        if(sETo == -1){
            Employees.showMainMenu();
        }
        PermanentEmployee employee = null;
        for (PermanentEmployee permanentEmployee: permanentEmployees){
            if (permanentEmployee.id == sETo){
                employee = permanentEmployee;
            }
        }
        showEmployee(employee);
    }

    static int showEmployees(){

        System.out.println("Permanent Employees\n");

        for (PermanentEmployee employee : permanentEmployees){
            System.out.println("Id: "+employee.id + "\nName: " + employee.name + "\n\n");
        }

        int to = Employees.showEmployeesMenu();
        return to;
    }
    static boolean validateMenuInput(int to){
        boolean valid = false;
        if (to == -1){
            valid = true;
        }else {
            boolean available = false;
            for (PermanentEmployee employee: permanentEmployees){
                if (employee.id == to){
                    available = true;
                }
            }
            if(available){
                valid = true;
            }
        }
        return valid;
    }

    static void showEmployee(PermanentEmployee employee){}
}
