package Output.DisplayBalance;
/*
    Account 1 DisplayBalance action responsible for printing the current balance of the account.
 */

import Data.Data;
import Data.DataAccount1;

public class DisplayBalance1 extends DisplayBalance {
//    public DisplayBalance1(Data data) {
//        super(data);
//    }

    /*
        displays the current value of the balance
         */
    @Override
    public void displayBalance(Data ds) {
        System.out.println("Account 1: Your balance is: " + ((DataAccount1) ds).getBalance());;
    }

}
