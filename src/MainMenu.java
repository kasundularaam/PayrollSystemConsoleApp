import java.util.Scanner;

public class MainMenu {

    static int showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAIN MENU\n");
        System.out.println("(enter index of menu item to navigate)\n");

        System.out.println("1. Add employee\n");
        System.out.println("2. Employees\n");
        System.out.println("3. Log out\n");

        System.out.println("Navigate to: ");
        int to = Integer.parseInt(scanner.nextLine());
        return to;
    }

    static  void navigate(int to){
        switch (to){
            case 1:
                Main.addEmployee();
            case 2:
                navigateToShowEmployees();
            case 3:
                Main.auth.logOut();

        }
    }

   static void navigateToShowEmployees(){
       int to = Employees.showMainMenu();
       boolean validMenuIndex = to >0 && to <5;
       while (!validMenuIndex){
           System.out.println("Wrong menu item! try again");
       }
       Employees.navigate(to);
   }
}
