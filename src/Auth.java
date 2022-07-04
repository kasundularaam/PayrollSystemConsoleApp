import java.util.Objects;
import java.util.Scanner;

public class Auth {

    final static String adminUsername = "admin";
    final static String adminPassword = "123456";
    private boolean loggedIn = false;

     void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ADMIN LOGIN\n");
        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("password: ");
        String password = scanner.nextLine();

        if(Objects.equals(username, adminUsername) && Objects.equals(password, adminPassword)) {
            loggedIn = true;
        }else{
            System.out.println("Wrong credentials! try again...");
            login();
        }
    }

     void logOut(){
        loggedIn = false;
       Main.runApp();
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
