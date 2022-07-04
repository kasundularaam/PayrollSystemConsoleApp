import java.util.Scanner;

public class Employees {
    static  int showMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("EMPLOYEES\n");

        System.out.println("1. permanent employees\n");
        System.out.println("2. casual employees\n");
        System.out.println("3. contract basis employees\n");
        System.out.println("4. back\n");

        System.out.println("Navigate to: ");
        return Integer.parseInt(scanner.nextLine());
    }

    static  void navigate(int to){
        switch (to){
            case 1:
                PermanentEmployees.navigate();
            case 2:
                CasualEmployees.navigate();
            case 3:
               ContractBasisEmployees.navigate();
            case 4:
                MainMenu.showMenu();
        }
    }

    static int showEmployeesMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id to see details\n");
        System.out.println("Enter -1 for back\n");

        System.out.println("Navigate to: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
