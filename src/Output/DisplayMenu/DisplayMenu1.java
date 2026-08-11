package Output.DisplayMenu;


public class DisplayMenu1 extends DisplayMenu {


//    public DisplayMenu1(Data data) {
//
//        super(data);
//    }

    /*
    This class will print out the menu for Account 1 ATM component.
     */
    @Override
    public void displayMenu(){

        System.out.println("Login successful.\n Please choose from the following Menu options> ");
        System.out.println("(3) Make Deposit");
        System.out.println("(4) Make Withdrawal");
        System.out.println("(5) Display Balance");
         // System.out.println("(4) Unlock");
        //System.out.println("(5) Logout");
    }
}
