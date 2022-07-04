public class Main {

    static Auth auth = new Auth();

    static  void addEmployee(){
        System.out.println("ADD EMPLOYEE\n");
    }

    static  void runApp(){
        auth.login();
        if(auth.isLoggedIn()){
            int mainTo = MainMenu.showMenu();
            boolean validMenuIndex = mainTo >0 && mainTo <4;
            while (!validMenuIndex){
                System.out.println("Wrong menu item! try again");
            }
            MainMenu.navigate(mainTo);
        }

    }

    public static void main(String[] args) {
         runApp();
    }
}
